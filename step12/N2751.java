package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class N2751 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
	
		
		int n = sc.nextInt();
	    ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			num.add(sc.nextInt());		
		}
		Collections.sort(num);
		for(int a :num)
		{
			sb.append(a).append('\n');
			
		}
	    System.out.println(sb);
		sc.close();
		
	
	}

}
