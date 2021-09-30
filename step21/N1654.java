package step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선의 수 
		int n = Integer.parseInt(st.nextToken()); // 필요한 랜선의 수 
		long max = 0;
		int []len = new int[k];
		
		for(int i=0;i<k;i++)
		{
			len[i] = Integer.parseInt(br.readLine());
		}
		
		
		for(int i=0;i<k;i++)
		{
			if(max < len[i])
			{
				max = len[i];
			}
		}
		
		max +=1;
		System.out.println(UpperBound(len,n,max));
		
		

	}
	
    public static long UpperBound(int []arr,int target,long max)
    {
    	long lo = 0;
    	long high = max;
    	long sum = 0;
    	long mid = 0;
    	
       
    	
    	while(lo<high)
    	{	
    		sum=0;
    		mid = (lo+high)/2;
    		for(int i=0;i<arr.length;i++)
    		{
    			sum += arr[i]/mid;
    		}
    		
    		if(sum<target)
    		{
    			high=mid;
    			
    		}else
    		{
    			lo = mid+1;
    		}
    		
    	}
    	
    	return lo-1;
    	
    	
    }

}
