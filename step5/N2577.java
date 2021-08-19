package step5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class N2577 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int [] num = new int[3];
	    int [] num2 = {0,1,2,3,4,5,6,7,8,9};
	    int [] count = new int[10];
 	    
	    for(int i=0;i<3;i++) {
	    	num[i] = Integer.parseInt(br.readLine());
	    	
	    }
	    
	    int result = num[0]*num[1]*num[2];
	    String[]result2 = String.valueOf(result).split("");
	    for(int i=0;i<10;i++)
	    {
	    	for(int j=0;j<result2.length;j++) {
	    	   if(num2[i]==Integer.parseInt(result2[j]))
	    	   {
	    		   count[i]++;
	    	   }
	    	}
	    	
	    }
	    
	    for(int k=0;k<10;k++)
	    {
	    	System.out.println(count[k]);
	    }
		

	}

}
