import com.fitch.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mteng on 1/25/2015.
 */
@Test
@ContextConfiguration(classes = com.fitch.config.AppConfig.class)
public class TestSpringContext extends AbstractTestNGSpringContextTests{

    // ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    // Integer result = context.getBeanDefinitionCount();
    ApplicationContext context;
    Integer result;

    @AfterMethod
    public void afterMethod(){
        System.out.println("@afterMethod");
        System.out.println(result);
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("@beforeMethod");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        result = context.getBeanDefinitionCount();
    }

    @Test()
    public void testSpringContext() {
        System.out.println("@inTheTest");
        Assert.assertNotNull(result);
    }
}
