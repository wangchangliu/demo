package com.example.demo.dao.generate.mapper;

import com.example.demo.dao.generate.dto.MerchantDTO;
import com.example.demo.dao.generate.dto.MerchantDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantDTOMapper {
    long countByExample(MerchantDTOExample example);

    int deleteByExample(MerchantDTOExample example);

    int deleteByPrimaryKey(Integer id);

    long batchInsert(List<MerchantDTO> list);

    int insert(MerchantDTO record);

    int insertSelective(MerchantDTO record);

    List<MerchantDTO> selectByExample(MerchantDTOExample example);

    MerchantDTO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantDTO record, @Param("example") MerchantDTOExample example);

    int updateByExample(@Param("record") MerchantDTO record, @Param("example") MerchantDTOExample example);

    int updateByPrimaryKeySelective(MerchantDTO record);

    int updateByPrimaryKey(MerchantDTO record);
}