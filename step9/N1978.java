package step9;

import java.util.Scanner;

public class N1978 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			
			
			boolean Prime = true;
			
			int num = in.nextInt();
			
			if(num == 1) {
				continue;
			}
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					Prime = false;	
					break;
				}
			}
			if(Prime) {	
				count++;
			}
		}
		System.out.println(count);

	}

}
