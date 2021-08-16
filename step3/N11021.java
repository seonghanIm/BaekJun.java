package step3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class N11021 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<T;i++) 
		{
			st = new StringTokenizer(br.readLine());
			bw.write("Case #"+(i+1)+": "+(Integer.parseInt(st.nextToken()) + (Integer.parseInt(st.nextToken())))+"\n");
		
		}
		
		bw.flush();
		
	

	}

}
