package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaddNumber {

	@Test
	public void test() {
		addNumberString obj = new addNumberString();
		int res = obj.addNumber(120,325);
		assertEquals(445,res);
	}
}
