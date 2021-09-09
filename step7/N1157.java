package step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class N1157 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String S = br.readLine().toUpperCase();
	    int max = -1;
	    int []arr = new int[26];
	    char maxch ='?';
	    
	    for(int i = 0; i<S.length();i++)
	    {
	    	arr[S.charAt(i)-65]++;
	    	if(max < arr[S.charAt(i)-65])
	    	{
	    		max = arr[S.charAt(i)-65];
	    		maxch = S.charAt(i); 
	    	}else if(max==arr[S.charAt(i)-65])
	    	{
	    		maxch = '?';
	    	}
	    }
	    bw.write(maxch + "\n");
	    bw.flush();
	    bw.close();
	}
}

	
