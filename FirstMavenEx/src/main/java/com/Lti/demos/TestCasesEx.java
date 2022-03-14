package com.Lti.demos;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.Lti.demo.calculator;

class TestCasesEx {
	
	

	/*@Test
	void test() {
		fail("Not yet implemented");
	}
*/
	
	  @Test
	  public void testcase1()
	  {                     
		    Assertions.assertEquals("HELLO","HELLO");
		    Assertions.assertEquals(500,200+300);
		    
	  }
	
	  @Test
	  public void TestAdd() {
		  calculator c = new calculator();
		  int r = c.add(300, 200);
		  Assertions.assertEquals(500,r);
		  System.out.println(r);
		  
	  }
	  
	  @Test
	  void testAssertFalse() {

	  Assertions.assertFalse("FirstName".length() == 10);
	  Assertions.assertFalse(10 > 20, "assertion message");
	  }
	  
	  @Test
	  public void testEmptyArrayList() {
	  ArrayList<Integer> al = new ArrayList<Integer>();
	  Assertions.assertEquals(0, al.size());
	  Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	  // assertFalse(al.isEmpty());
	  }
	  
	  @Test
	  void testAssertNull() {
	  String str1 = null;
	  String str2 = "abc";
	  Assertions.assertNull(str1);// str 1 is null - condition is ok test case ok
	  Assertions.assertNotNull(str2); // str2 - notnull ? - condtion is ok - test case ok
	  }
	  
	
}