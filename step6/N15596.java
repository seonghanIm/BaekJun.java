package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

class Test{
	public long sum(int[] a) {
	    long ans=0;
		for(int i = 0; i<a.length;i++)
		{
			ans = ans + a[i];
		}
		
		return ans;
	}
}






public class N15596 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int []a = new int[3000000];
		int token = st.countTokens();
		for(int i = 0; i<token;i++)
		{
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		Test myTest = new Test();
		long sum = myTest.sum(a);

		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}

}
