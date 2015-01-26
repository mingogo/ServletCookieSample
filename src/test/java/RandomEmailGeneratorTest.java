import com.fitch.beans.RandomEmailGenerator;
import com.fitch.beans.RandomEmailGeneratorImpl;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RandomEmailGeneratorTest extends TestNG {

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testGenerate() throws Exception {
        RandomEmailGenerator obj = new RandomEmailGeneratorImpl();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");
        // Assert.assertEquals(email, "feedback@yoursite.comm");

    }
    @Test
    public void testGenerate2() throws Exception {
        RandomEmailGenerator obj = new RandomEmailGeneratorImpl();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");
        // Assert.assertEquals(email, "feedback@yoursite.comm");

    }
}