package com.mycompany.fibonacci.factorial;

public class FibonacciFactorial {
	
	//This class will count value of Fibonacci stream elements and factorial using different method 
	
	public long incfibonacci(int n) {
		
		long element1 = 0;
		long element2 = 0;
		long result = 0;
		
		if (n <= 0) return -1;
		else if (n == 1) return 0;
		else if (n == 2) return 1;
		else 
			for ( int i=1; i <= n; i++ ) {
				if (i == 1) element1 = 0;
				else if (i == 2) element2 = 1;
				else {
					result = element1 + element2;
					element1 = element2;
					element2 = result;
				}
					
			}
		return result;

	}
	
	public long recfibonacci(int n) {
		if (n <= 0) return -1;
		else if ( n == 1) return 0;
		else if (n == 2) return 1;
		else return recfibonacci(n-2) + recfibonacci(n-1);
	}
	
	public long incfactorial(int n) {

		long result = 1;
		
		switch(n) {
			case 0:
				return 1;
			case 1:
				return 1;
			default:
				for (int i=1; i <= n ; i++) {
					result *= i;
				}
		}
		
		return result;
	}
	
	public long recfactorial(int n) {
		
		if (n == 0) return 1;
		else if (n == 1)return 1;
		else return recfactorial(n-1)*n;
	}
	

}
