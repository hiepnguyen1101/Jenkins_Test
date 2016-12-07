
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	@Test
	public void testAdd(){
		String str = "Hello World";
		assertEquals(str,"Hello World");
	}
}
