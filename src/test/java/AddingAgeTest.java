import com.fitch.beans.AddingAge;
import com.fitch.beans.AddingAgeImpl;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingAgeTest {

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddingAgeMethod() throws Exception {
        AddingAge addingAge = new AddingAgeImpl();
        Integer result = addingAge.AddingAgeMethod(30);
        Integer answer = 30;
        Assert.assertEquals(answer,result);
    }
}