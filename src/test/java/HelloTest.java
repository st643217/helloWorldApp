import org.junit.Assert;
import org.junit.Test;

import com.test.Hello;

public class HelloTest {
	@Test
	public void test() {
		Hello hello = new Hello();
		hello.testMain();
		String input = "abc";
		Assert.assertEquals(input, "abc");
	}

}
