package step5;

import java.util.*;

public class N1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
	    double []score = new double[N];
		double max = 0;
		
		double []nscore = new double[N];
		double hap = 0;

		for(int i=0;i<N;i++) {
			score[i] = sc.nextInt();
		}
		for(int j=0;j<N;j++)
		{
			if(score[j]>max)
			{
				max = score[j];
			}
		
		}
	
		for(int k=0;k<N;k++) 
		{
			nscore[k]=score[k]/max*100;
		}
		for(int l=0;l<N;l++)
		{
			hap = hap + nscore[l];
		}
		
		System.out.println(hap/N);
		sc.close();
	}

}
