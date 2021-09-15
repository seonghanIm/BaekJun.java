	package step10;
	
	import java.util.Scanner;
	
	public class N10872 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			if(n==0)System.out.println("1");
			else System.out.println(factorial(n));
	
		}
		
		public static int factorial(int a)
		{
			if(a<=1)return a;
			
			else
			{
				return factorial(a-1) * a;
			}
		}
	
	}
