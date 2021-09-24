package step21;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1920 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
				
		
		int N = Integer.parseInt(br.readLine());
		int []num = new int[N];
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			num[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		int M = Integer.parseInt(br.readLine());
		int []num2 = new int[M];
 		StringTokenizer st2 = new StringTokenizer(br.readLine());
 		for(int i=0;i<M;i++)
 		{
 			num2[i] = Integer.parseInt(st2.nextToken());
 		}
 		
 		for(int i=0;i<M;i++)
 		{
 			System.out.println(BinarySearch(num,num2[i]));
 		}

		
				

	}
	
   public static int BinarySearch(int[]arr, int num)
   {
	   int high = arr.length -1;
	   int low = 0;
	   int mid = 0;
	   
	   while(low<=high)
	   {
		   mid = (high + low)/2;
		   if(arr[mid]==num)
		   {
			   return 1;
		   }else if(arr[mid]>num)
		   {
			   high=mid-1;
		   }else if(arr[mid]<num)
		   {
			   low=mid+1;
		   }
			   
	   }
	   return 0;
	   
   }

}
