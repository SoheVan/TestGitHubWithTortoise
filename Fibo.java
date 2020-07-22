package com.sohe;

public class Fibo {

/**
*This is the change for branch 02
*step 1: change 1
*step 1: change 2
*step 1: change 3
*/
	public static void main(String[] args) {
		int result = Fibo.fibo(10);
		System.out.println("result " + result);

	}
	
	public static int fibo(int n){
		/*this is the method to call*/
		if(n==1 || n==2)
			return 1;
		return fibo(n-1) + fibo(n-2);
	}

}
