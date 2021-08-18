package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1110 {

	public static void main(String[] args) throws IOException {
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
        
		String N; // 초기
		String hap; //두수의합 
		int Nhap =0; // 두수의 합의 int형
		String NewN ="";//규칙에 의해 만들어진 새로운 N
		
		int cycle = 0;
		st = new StringTokenizer(br.readLine());
		N = st.nextToken(); //초기 문자열
		String Target = N;
		
		while(true) {
        if(N.length()==1) { // 자릿수 검증 한자리일경우 앞에 0추가
			N = "0" + N;
		}
		String[] num = N.split(""); // 문자열을 나눠서 저장 
		Nhap = Integer.parseInt(num[0]) + Integer.parseInt(num[1]); // 두수의 합
		hap = String.valueOf(Nhap);//형변환 
	    if(hap.length()==1) {
		hap = "0" + hap;
	    }
	    String[] num2 = hap.split(""); 
	    
		NewN = num[1] + num2[1]; 
		N = NewN;
		if(Integer.parseInt(Target) == Integer.parseInt(NewN)) {
			cycle = cycle + 1;
			break;
		}
		else {
			
			cycle = cycle + 1;
		}
		
	    
	    }
		
		
		System.out.println(cycle);
		
	}

}
