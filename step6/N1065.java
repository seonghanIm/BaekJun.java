package step6;
import java.util.*;


public class N1065 {
	
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ans = 0;
	    if(N<100)
	    {
	    	System.out.println(N);
	   
	    }
	    else 
	    {
	    	ans=Hansu(N)+99;
	    	System.out.println(ans);
	    }
		
	
		sc.close();

	}
	
	
	
	
	private static int Hansu(int n) {
		int count=0;
		int a=0;
		int b=0;
		int c=0;
		int cha = 0;
		
		
		if(n==1000)count--;
		
		for(int i = 100; i<=n;i++)
		{
			
			a = i%10; // 첫째자리
	        b = (i/10)%10; //둘째자리 
	        c = (i/100)%10;//셋째자리 
	        
	        cha = b-a;
	        
	        if(cha == c-b)
	        {
	        	count++;
	        }
		}

		return count;
	}

}
