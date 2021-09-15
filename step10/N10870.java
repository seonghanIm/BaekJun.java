package step10;

import java.util.Scanner;

public class N10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		System.out.println(Fibo(n));  
		
		sc.close();

	}
	
	public static int Fibo(int a)
	{
		if(a==0) return 0;
		if(a==1) return 1; 
		else return  Fibo(a-1) + Fibo(a-2);
		 
	
	}

}
