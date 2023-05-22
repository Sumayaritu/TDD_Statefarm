package misc;

import org.testng.annotations.Test;

import util.Configuration;

public class UnitTest {
	Configuration config=new Configuration();
	@Test
	public void configurationUnitTest() {
		System.out.println(config.getProp("browser"));
	}
	@Test
	public void configurationUnitTest2() {
		System.out.println(config.getPropNum("pageLoad"));
	}

}
