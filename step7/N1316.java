package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반례를 지워가는식으로 생각 /그룹문자가 되려면 문자가 연속되어야 하고, 다른곳에 그문자가 나오면 안된다./
// 반례를 생각하면, 연속이 아닌 문자가 있고, 다른곳에 그 문자가 나오는 경우이다.

public class N1316 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = N;
		
		
		for(int i = 0; i<N;i++)
		{
			String S = br.readLine();
			boolean[] check = new boolean[26];
			
			for(int k = 1;k<S.length();k++)
			{ 
		       if(S.charAt(k)!=S.charAt(k-1))
		       {
		    	   if(check[S.charAt(k)-97]==true)
		    	   {
		    		   count--;
		    		   break;
		    	   }
		    	   check[S.charAt(k-1)-97] = true;
		       }
			}

		}
		
		System.out.println(count);
		
		
		

	}

}
