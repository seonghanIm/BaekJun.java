package step8;

import java.io.BufferedReader;
import java.io.IOException;



public class N2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int range = 2;
		int count =1;
		if(n==1)
		{
			System.out.println("1");
		}
		else{while(range<=n)
		{
			range =range+ (6*count);
			count++;
		}
		
		System.out.print(count);
		}
	}

}
