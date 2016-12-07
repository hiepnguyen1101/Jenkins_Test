/**
 * Created by Steve Nguyen on 11/22/2016.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Module_A_Test {
    @Test
    public void test(){
        Module_A module_a=new Module_A();
        assertEquals(1,module_a.return_num());//"This should return 1",
    }
    @Test
    public void test2(){
        Module_A module_a=new Module_A();
        assertEquals(2,module_a.return_num()+1);//"This should return 2",
    }
}
