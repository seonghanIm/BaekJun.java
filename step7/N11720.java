package step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class N11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		String []num = new String[100];
	    num = br.readLine().split("");
	    int sum = 0;
	    for(int i = 0;i<N;i++)
	    {
	    	sum += Integer.parseInt(num[i]);
	    }
		
		
 		
		bw.write(sum + "\n");
		bw.flush();
		bw.close();

	}

}
