package twopointer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class N3273 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		for(int i = 0; i<N;i++)
		{
			num.add(Integer.parseInt(st.nextToken()));
		}
		
		int X = Integer.parseInt(br.readLine());
	    Collections.sort(num);
	    int start = 0;
	    int end = N-1;
		while(start < end)
		{
	       int sum = num.get(start) + num.get(end);
	       if(sum==X)
	       {
	    	   count++;
	    	   start++;
	    	   end--;
	       }else if(sum>X)
	       {
	    	   end--;
	       }else if(sum<X)
	       {
	    	   start++;
	       }
		}
	    //System.out.println(count);
	    bw.write(count+"\n");
	    
	    
	    
	    bw.close();
	    
	    
	    
	}

}
