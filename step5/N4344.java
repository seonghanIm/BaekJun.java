package step5;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.util.*;

public class N4344 {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//Scanner sc = new Scanner(System.in);
		
		ArrayList <Integer>score = new ArrayList<Integer>();
	    ArrayList<Double> av = new ArrayList<Double>();
		

		double []p=new double[100];

		String C = br.readLine();
		if(C!=null) {
		for(int i=0;i<Integer.parseInt(C);i++)
		{
		    String N = "";
			double sum= 0.0;
			int count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			N = st.nextToken();
			for(int k=0;k<Integer.parseInt(N);k++)
			{
				score.add(Integer.parseInt(st.nextToken()));
				sum= sum+score.get(k);
			}
			
	        av.add(sum/Integer.parseInt(N));
	        
	        for(int a=0;a<Integer.parseInt(N);a++)
	        {
	        	if(score.get(a)>av.get(i))
	        	{
	        		count++;
	        	}
	        }
	      
	        p[i] = count/Double.parseDouble(N)*100;
	        score.clear();
	    	bw.write(String.format("%.3f", count/Double.parseDouble(N)*100)+"%\n");
		}
		}
//		for(int l=0;l<Integer.parseInt(C);l++)
//		{
//			
//			System.out.println(String.format("%.3f",p[l]) + "%");
//		}
		bw.flush();
		bw.close();
		//sc.close();
	}

}