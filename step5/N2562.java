package step5;


import java.io.FileInputStream;
import java.io.IOException;

import java.util.ArrayList;

import java.util.*;
public class N2562 {


	public static void main(String[] args) throws Exception, IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
	
	  
	    ArrayList<Integer> num = new ArrayList<Integer>();
	    for(int i=0;i<9;i++) {
	    	
	    	num.add(sc.nextInt());
	    }
	    int Max = 0;
	    int MaxN = 0;
	    for(int j=0;j<9;j++) {
	        if(Max<num.get(j)) {
	        	Max = num.get(j);
	        	MaxN = j+1;
	        	
	        }
	    }
	  
	    
	    System.out.println(Max);
	    System.out.println(MaxN);
	    
	    sc.close();
		

	//br.close();
	//bw.flush();
	

	}

}