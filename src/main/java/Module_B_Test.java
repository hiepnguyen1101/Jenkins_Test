/**
 * Created by Steve Nguyen on 11/22/2016.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Module_B_Test {
    @Test
    public void test(){
        Module_B module_b=new Module_B();
        assertEquals(2,module_b.return_two());//"This should return two",
    }
}
