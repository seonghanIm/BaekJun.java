package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String S = br.readLine();
	
		
		for(int i=0;i<S.length();i++)
		{
		if(S.contains("c="))
		{
			
			S=S.replace("c=", "a");
			
			
		}else if(S.contains("c-"))
		{
			
			S=S.replace("c-", "a");
			
		}else if(S.contains("dz="))
		{
			
			S=S.replace("dz=", "a");
			
		}else if(S.contains("d-"))
		{
			
			S=S.replace("d-", "a");
			
		}else if(S.contains("lj"))
		{
			
			S=S.replace("lj", "a");
			
		}else if(S.contains("nj"))
		{
			
			S=S.replace("nj", "a");
			
		}else if(S.contains("s="))
		{
			
			S=S.replace("s=", "a");
			
		}else if(S.contains("z="))
		{
			
			S=S.replace("z=", "a");
			
		}
		}
		
		System.out.println(S.length());
		
	    
	    
	    
	    
	    
	}
}
