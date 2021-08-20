package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class N3052 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>(); //중복된 값을 넣지 않는 리스트 
 
		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		
		}
		br.close();
		System.out.print(hs.size());
	}
}
