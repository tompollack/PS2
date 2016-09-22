package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() 
	{
		MyInteger test1 = new MyInteger(2);
		MyInteger test2 = new MyInteger(9);
		MyInteger test3 = new MyInteger(2);
		
		assertEquals(test1.get(),2);
		assertEquals(test1.isEven(),true);
		assertEquals(test2.isEven(),false);
		assertEquals(test2.isOdd(),true);
		assertEquals(test1.isOdd(),false);
		assertEquals(test1.isPrime(),true);
		assertEquals(test2.isPrime(),false);
		assertEquals(test1.isEven(2),true);
		assertEquals(test1.isEven(3),false);
		assertEquals(test1.isOdd(3),true);
		assertEquals(test1.isOdd(2),false);
		assertEquals(test1.isPrime(2),true);
		assertEquals(test1.isPrime(9),false);
		assertEquals(test1.isEven(test3),true);
		assertEquals(test1.isEven(test2),false);
		assertEquals(test1.isOdd(test3),false);
		assertEquals(test1.isOdd(test2),true);
		assertEquals(test1.isPrime(test3),true);
		assertEquals(test1.isPrime(test2),false);
		assertEquals(test1.equals(2),true);
		assertEquals(test1.equals(4),false);
		assertEquals(test1.equals(test3),true);
		assertEquals(test1.equals(test2),false);
	}

}
