package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N2108 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int []num = new int[N];
		
		for(int i=0;i<N;i++)
		{
			num[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(MostFrequent(num));
	   

	}
	
	
	public static double Average(int []arr)
	{	
	    double result = 0;
	

		for(int i=0;i<arr.length;i++)
		{
		    result += arr[i];
		}
		
		result = result/arr.length;
		return result;
	}
	
	public static int Center(int []arr)
	{
		Arrays.sort(arr);
		int index = arr.length/2;
		
		return arr[index];
	}
	
	public static int MostFrequent(int []arr)
	{
		int []arr2 = new int[4001]; //양수배열 
		int []arr3 = new int[4001]; //음수배열
		int max = 0;
		int max2 = 0;
		int []result = new int[arr.length];
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>=0)
		    {
		    	arr2[arr[i]]++;
		    }else
		    {
		    	arr3[arr[i]*-1]++;
		    }
		    
		}
		for(int i=0;i<10;i++)
		{
			if(arr2[i]>max)
			{
				max = i;
			}
			if(arr3[i]>max)
			{
				max2 = i;
			}
			
		}
		result[0] = max;
		int []result2 = new int[arr.length];
		result[2];
		for(int i = 0;i<4001;i++)
		{
			if(arr2[i]==max)
			{
				result[i+1] = i;
			}
		}
		
		Arrays.sort(result);
		return result[1];
		

		
	}
	public static int Range(int []arr)
	{
		int max, min =0;
		Arrays.sort(arr);
		max = arr[0];
		min = arr[arr.length-1];
		
		return max - min;
	
	}
	
	

}
