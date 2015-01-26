import com.fitch.beans.RandomEmailGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by mteng on 1/25/2015.
 */
@Test
@ContextConfiguration(locations = {"classpath:spring-test-config.xml"})
public class TestSpring extends AbstractTestNGSpringContextTests{

    @Autowired
    RandomEmailGenerator randomEmailGenerator;

    @Test()
    void testEmailGenerator() {

        String email = randomEmailGenerator.generate();
        System.out.println(email);

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");
    }
}
