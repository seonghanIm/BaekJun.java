package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class N10818 {


	public static void main(String[] args) throws Exception, IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
	  
	    ArrayList<Integer> num = new ArrayList<Integer>();
	    for(int i=0;i<N;i++) {
	    	
	    	num.add(Integer.parseInt(st.nextToken()));
	    }
	    int Max = num.get(0);
	    int Min = num.get(0);
	    for(int j=0;j<N;j++) {
	        if(Max<num.get(j)) {
	        	Max = num.get(j);
	        }
	    }
	    for(int k= 0; k<N;k++) {
	        if(Min>num.get(k))
	        {
	        	Min = num.get(k);
	        }
	    }
	    bw.write(String.valueOf(Min) +" "+ String.valueOf(Max));
		

	br.close();
	bw.flush();
	

	}

}
