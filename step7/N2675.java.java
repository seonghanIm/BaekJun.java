package step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class N2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
	
		
		for(int i = 0; i<T;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			
			String a = st.nextToken();
			
			for(int j=0;j<a.length();j++)
			{
				char b = String.valueOf(a).charAt(j);
				for(int k =0 ;k<R;k++)
				{ 
				bw.write(b);
				}
				
			}
		    bw.write("\n");
		}
		
		bw.flush();
		bw.close();

	}

}
