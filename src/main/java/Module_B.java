/**
 * Created by Steve Nguyen on 11/22/2016.
 */
public class Module_B {

    public Module_B() {
    }

    public int return_two(){
        int result;
        Module_A module_a=new Module_A();
        result=module_a.return_num()+module_a.return_num();
        return result;
    }
}
