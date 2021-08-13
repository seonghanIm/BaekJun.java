package step2;
import java.io.FileInputStream;
import java.util.Scanner;

public class N2753 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		int Year = sc.nextInt();
		
		if(Year%4==0) {
			
			if(Year%100!=0||Year%400==0){
				System.out.println("1");
			}else
			{
				System.out.println("0");
			}
				
		}else {
			System.out.println("0");
		}
		sc.close();
	}

}
