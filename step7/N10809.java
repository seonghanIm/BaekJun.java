package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class N10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	   String S = br.readLine();
	   int []alpa = new int[26];
	   
	   for(int i =0;i<alpa.length;i++)
	   {
		   alpa[i]=-1;
	   }
	   for(int i = 0;i<S.length();i++)
	   {
		   char ch = String.valueOf(S).charAt(i);
		   int ch2 = (int)ch;
		   int ch3 = ch2 - 97;
		   if(alpa[ch3]==-1)
		   {
			   alpa[ch3] = i;
		   }else
		   {
			   continue;
		   }
		   
	   }
	   for(int i = 0; i<alpa.length;i++)
	   {
		   System.out.print(alpa[i]+" ");
	   }
	   

	}

}
