package step5;

import java.io.BufferedReader;
//import java.util.*;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class N8958 {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//Scanner sc = new Scanner(System.in);

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		String []ox = new String[100];
		int []score = new int[Integer.parseInt(N)];
	
		
		for(int l=0;l<Integer.parseInt(N);l++)
		{
			ox[l] = br.readLine();
		}
	    
		for(int i=0;i<Integer.parseInt(N);i++)
		{
			int score1 =0;
			int count = 0;
		   
		    String[] scoreArray = ox[i].split("");
		    for(int k=0;k<scoreArray.length;k++) 
		    {
		    	if(k==0) 
		    	{
		            if(scoreArray[k].equals("O"))
		             {
		    	     score1 = score1 + 1;
		    	     count++;
		             }
		            else if(scoreArray[k].equals("X"))
		             {
		        	  continue;
		             }
		    	}
		    	else if(k!=0) 
		    	{
		    		if(scoreArray[k].equals("O")&&scoreArray[k-1].equals("O"))
		    		{
		    			score1 =score1 + 1 + count;
		    			count++;
		    		}else if(scoreArray[k].equals("O")&&scoreArray[k-1].equals("X"))
		    		{
		    			score1 = score1 + 1;
		    			count++;
		    		}else
		    		{
		    			count =0;
		    		}
		    		
		    	}
		    	
		    }
		    score[i]=score1;
		}
		
		for(int j=0;j<Integer.parseInt(N);j++)
		{
			System.out.println(score[j]);
		}
		
	    
		
		br.close();
		bw.close();
	}

}
