package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaddString {

	@Test
	public void test() {
		addNumberString obj = new addNumberString();
		String res = obj.addString("Software ","Engineering");
		assertEquals("Software Engineering",res);
	}

}
