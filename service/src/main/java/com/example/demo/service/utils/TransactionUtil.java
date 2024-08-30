package com.example.demo.service.utils;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Spring 事务帮助类
 */
@Slf4j
@Component
public class TransactionUtil {

    @Resource
    private DataSourceTransactionManager transactionManager;

    public void setTransactionManager(DataSourceTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public <T> T execute(Func<T> action) {
        return execute(action, Propagation.REQUIRED, -1);
    }

    public <T> T execute(Func<T> action, int timeout) {
        return execute(action, Propagation.REQUIRED, timeout);
    }

    public <T> T execute(Func<T> action, Propagation propagation) {
        return execute(action, propagation, -1);
    }

    public <T> T execute(Func<T> action, Propagation propagation, int timeout) {
        // 非Spring不支持
        if (transactionManager == null) {
            log.error("transactionManager注入失败, 事务不生效");
            return action.invoke();
        }

        // Spring事务处理
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        if (propagation != null) {
            def.setPropagationBehavior(propagation.value());
        } else {
            def.setPropagationBehavior(Propagation.REQUIRED.value());
        }
        def.setTimeout(timeout);

        TransactionStatus status = transactionManager.getTransaction(def);

        try {
            T result = action.invoke();
            transactionManager.commit(status);
            return result;
        } catch (Exception ex) {
            try {
                transactionManager.rollback(status);
            } catch (TransactionException trEx) {
                log.error("transactionManager.rollback error, ", trEx);
            } finally {
                throw ex;
            }
        }
    }

    public void executeWithoutResult(FuncWithoutResult action) {
        execute(() -> {
            action.invoke();
            return null;
        });
    }

    public void executeWithoutResult(FuncWithoutResult action, int timeout) {
        execute(() -> {
            action.invoke();
            return null;
        }, timeout);
    }

    public void executeWithoutResult(FuncWithoutResult action, Propagation propagation) {
        execute(() -> {
            action.invoke();
            return null;
        }, propagation);
    }

}