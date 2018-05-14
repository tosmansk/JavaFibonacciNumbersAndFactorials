package com.mycompany.fibonacci.factorial.test;

import com.mycompany.fibonacci.factorial.FibonacciFactorial;
import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class FibonacciTest {
	
	/*
	 * This class is Test one which consists with 2 Test Cases which count Fibonacci element value using
	 * 2 different methods. It also counts functorial`s results.
	 */
	
	@Test
	public void fibonaccitest1() {
		
		long result;
		
		FibonacciFactorial fib = new FibonacciFactorial();
		result = fib.incfibonacci(10);
		assertTrue(result == 34);
	}
	
	@Test
	public void fibonaccitest2() {
		
		long result;
		FibonacciFactorial fib = new FibonacciFactorial();
		result = fib.recfibonacci(20);
		assertTrue(result == 4181);
	}
	@Test
	public void factorialtest3() {
		
		long result;
		FibonacciFactorial fib = new FibonacciFactorial();
		result = fib.incfactorial(10);
		assertTrue(result == 3628800);
	}
	@Test
	public void factorialtest4() {
		
	
		long result;
		FibonacciFactorial fib = new FibonacciFactorial();
		result = fib.recfactorial(10);
		assertTrue(result == 3628800);
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("The 4 Test Cases will be run");
	}
}
