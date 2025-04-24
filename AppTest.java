package og;
import org.testing.Assert;

import pkg.App;


public class AppTest {
	
	public void testlogin() {
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("abc", "abc123"));
	}
	public void testlogin2() {
		App myapp=new App();
		Assert.assertEquals(1,myapp.userLogin("abc","abc@123"));
	}
                      
}
