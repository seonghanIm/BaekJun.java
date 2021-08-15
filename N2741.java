package step3;
import java.util.Scanner;
public class N2741 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int S = N;
		
		
		for(int i=1;i<=S;i++)
		{
			System.out.println(N-(N-i));
			N = N-1;
		}
		sc.close();

	}

}
