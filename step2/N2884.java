package step2;
import java.util.Scanner;
public class N2884 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		
		if(H<=23&&H>0)
		{
			if(M>=45)
			{
				M = M-45;
			}
			else if(M<45)
			{
				H = H-1;
				M = 15+M;
			}
		}
		else if(H==0)
		{
			
			if(M>=45)
			{
				M = M-45;
			}
			else if(M<45)
			{
				H = 23;
				M = 15+M;
			}
		}
		
		System.out.println(H);
		System.out.println(M);
		sc.close();
		
		
	}

}
