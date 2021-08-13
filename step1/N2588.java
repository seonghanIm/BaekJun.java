package step1;

import java.util.Scanner;
import java.io.FileInputStream;
public class N2588 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
	    int[] C = new int[3];
	    int D = A*B;
	 
		
		for(int i = 0; i<C.length; i++)
		{
			C[i] = B%10;
			B = B/10;
			//System.out.println(C[i]);
		}
			
		
		
	    
		for(int j=0; j<3; j++) {
		System.out.println(C[j]*A);
		}
		System.out.println(D);
		
		sc.close();
	}

}
