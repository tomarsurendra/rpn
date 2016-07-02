package com.java.main;

import org.junit.Test;

import junit.framework.TestCase;

public class TestRPN extends TestCase{

	@Test
	public void testRPNAdd()  {
		String exp = "2,2,+";
		RPNOperation rpnObj = new RPNOperation();
		 assertEquals(4, rpnObj.Operation(exp));
	}
	@Test
	public void testRPNSub()  {
		String exp = "5,2,-";
		RPNOperation rpnObj = new RPNOperation();
		assertEquals(-3, rpnObj.Operation(exp));
	}
	@Test
	public void testRPNMub()  {
		String exp = "5,2,*";
		RPNOperation rpnObj = new RPNOperation();
		 assertEquals(10, rpnObj.Operation(exp));
	}
	@Test
	public void testRPNAddMul()  {
		String exp = "5,6,3,3,+,+,+";
		RPNOperation rpnObj = new RPNOperation();
		assertEquals(17, rpnObj.Operation(exp));
	}
	
	@Test
	public void testRPNAddMul1()  {
		String exp = "5,6,3,+,+,";
		RPNOperation rpnObj = new RPNOperation();
		 assertEquals(14, rpnObj.Operation(exp));
	}
	
	@Test
	public void testRPNAddMul2()  {
		String exp = "5,6,3,+,-,";
		RPNOperation rpnObj = new RPNOperation();
		assertEquals(4, rpnObj.Operation(exp));
	}
	
	@Test
	public void testRPNAddMul3()  {
		String exp = "5,1,2,+,4,*,+,3,-";
		RPNOperation rpnObj = new RPNOperation();
		System.out.println("Result :: "+ rpnObj.Operation(exp));
		assertEquals(-14, rpnObj.Operation(exp));
	}
}
