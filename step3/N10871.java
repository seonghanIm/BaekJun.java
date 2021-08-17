package step3;

import java.util.*;

public class N10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		ArrayList<Integer> Num = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++)
		{
			Num.add(sc.nextInt());
		}
		
		for(int j=0;j<N;j++)
		{
			if(Num.get(j)<X)
			{
				System.out.println(Num.get(j));
			}
		}
		
		sc.close();
		

	}

}
