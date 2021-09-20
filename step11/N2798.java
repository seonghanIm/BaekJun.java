package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2798 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 카드의 수 
        int m = Integer.parseInt(st.nextToken()); // 최대값 		
  

        int[] num = new int[n];
        int max = 0;
    
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
        {
        	num[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0;i<n;i++)
        {
        	for(int k=1;k<n;k++)
        	{   
        		for(int j=2;j<n;j++)
        		{
        			if(num[i]+num[k]+num[j]>max && num[i]+num[k]+num[j]<=m && i!=k && i!=j && k!=j)
        			{
        				max = num[i]+num[k]+num[j];

        			}
        		}
        	}
        }
        
        System.out.println(max);
 
    
        
	}

}
