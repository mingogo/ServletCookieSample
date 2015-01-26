/**
 * Created by mteng on 1/24/2015.
 */
import org.junit.*;

/**
 * JUnit Expected Exception Test
 * @author mkyong
 *
 */
public class JunitTest2 {

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1/0;
    }

}
