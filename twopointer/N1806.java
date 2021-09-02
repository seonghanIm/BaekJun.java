package twopointer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Scanner;
public class N1806 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int S = sc.nextInt();
	    int [] num = new int[N+1];
		
		for(int i = 0; i<N; i++)
		{
			num[i] = sc.nextInt();
		}
		
		
		int s = 0;
		int e = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
	    while(s<=N&&e<=N)
	    {
	    	if(sum>=S&& min>e-s) {
	    		min = e-s;
	    	}
	    	if(sum < S)
	    	{
	    		sum = sum + num[e++];
	    	}
	    	else
	    	{
	    		sum = sum - num[s++];
	    	}
	    
	    }
	    
	    if(min == Integer.MAX_VALUE)
	    {
	    	System.out.println("0");
	    	
	    }else {
	    	System.out.println(min);
	    }
		

	}

}
