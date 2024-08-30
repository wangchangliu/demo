import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@ActiveProfiles(profiles = {"dev"})
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class BaseTest {

    @Test
    public void contextLoads() {
        System.out.println("测试～～～～～～");

    }

}
