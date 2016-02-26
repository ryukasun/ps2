package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	static MyInteger myInt;
	static MyInteger myNum;
	static MyInteger myNumero;
	static MyInteger MY;
	//static MyInteger Value;
	//static int iValue;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myInt = new MyInteger(3);
		myNum = new MyInteger(4);
		myNumero = new MyInteger(39);
		MY = new MyInteger(2);
		//Value = new MyInteger(10);
		
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
	public void IntValueTest() {
		int x = 10;
		int y = 11;
		assertTrue(MyInteger.isEven(x));
		assertFalse(MyInteger.isOdd(x));
		assertFalse(MyInteger.isPrime(x));
		
		assertFalse(MyInteger.isEven(y));
		assertTrue(MyInteger.isOdd(y));
		assertTrue(MyInteger.isPrime(y));
		assertFalse(MyInteger.isPrime(39));
		
	}
		
	@Test
	public void MyIntegerValueTest(){
		//int Value = 10;
		
		assertFalse(MyInteger.isEven(myInt));
		assertTrue(MyInteger.isOdd(myInt));
		assertTrue(MyInteger.isPrime(myInt));
		
		assertTrue(MyInteger.isEven(myNum));
		assertFalse(MyInteger.isOdd(myNum));
		assertFalse(MyInteger.isPrime(myNum));
		
		
	}
	@Test
	public void NoArgsTest(){
		assertTrue(myInt.isPrime());
		assertFalse(myInt.isEven());
		assertTrue(myInt.isOdd());
		
		assertFalse(myNum.isPrime());
		assertTrue(myNum.isEven());
		assertFalse(myNum.isOdd());
		
		assertFalse(myNumero.isPrime());
		assertFalse(myNumero.isEven());
		assertTrue(myNumero.isOdd());
	}
	
	@Test 
	public void EqualsTest(){
		
		assertTrue(myInt.equals(3));
		assertTrue(myInt.equals(myInt));
		assertFalse(myInt.equals(20));
		assertFalse(myInt.equals(myNum));
	}

}
