package step7;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;


public class N2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
	    int [] numA1 = new int[3];
	    int [] numA2 = new int[3];
	    
	    for(int i = 0; i<3;i++)
	    {
	    	numA1[i] = num1%10;
	    	num1 = num1/10;
	    	numA2[i] = num2%10;
	    	num2 = num2/10;
	    }
		
	    num1 = (numA1[0]*100)+(numA1[1]*10)+numA1[2];
	    num2 = (numA2[0]*100)+(numA2[1]*10)+numA2[2];
	    
	   System.out.println(Math.max(num1, num2));
      
		
		

	}

}
