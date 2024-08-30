import org.mybatis.generator.api.ShellRunner;

public class MybatisPlusGenerator {
    public static void main(String[] args) {
        args = new String[3];
        args[0] = "-configfile";
        MybatisPlusGenerator.class.getResource("/");
        String configRootPath = MybatisPlusGenerator.class.getResource("/").getPath().replaceAll("%20", " ");
        args[1] = configRootPath + "generator.xml";
        System.getProperties().put("mysql.driver.path", "/Users/" + System.getProperties().get("user.name") + "/.m2/repository/mysql/mysql-connector-java/5.1.29/mysql-connector-java-5.1.29.jar");
        args[2] = "-overwrite";
        ShellRunner.main(args);
    }
}
