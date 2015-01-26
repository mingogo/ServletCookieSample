import com.fitch.beans.AddingAgeImpl;
import com.fitch.dto.Person;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddingAgeImplTest {

    AddingAgeImpl addingAge;
    Person person;

    @BeforeMethod
    public void setUp() throws Exception {
        person = new Person();
        addingAge = new AddingAgeImpl();
        System.out.println("@Before Method");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("@AfterMethod");
    }

    @Test
    public void testAddingAgeMethod() throws Exception {
        System.out.println("@In The Test.");
        Integer result = addingAge.AddingAgeMethod(30);
        Assert.assertNotNull(result);
    }
}