package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class N1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    String num = br.readLine();
		String []ArrNum1 = num.split("");
	    Integer []ArrNum = new Integer[ArrNum1.length];
		for(int i = 0;i<ArrNum.length;i++)
		{
		      ArrNum[i] = Integer.parseInt(ArrNum1[i]);
		}
		
		Arrays.sort(ArrNum,Collections.reverseOrder());
		
		for(int i=0; i<ArrNum.length;i++)System.out.print(ArrNum[i]);

	}

}
