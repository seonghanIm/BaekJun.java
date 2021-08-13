package step2;

import java.util.*;
import java.io.FileInputStream;

public class N9498 {

	public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        
        System.out.println(score);
        if(score<=100&&score>=90)
        {
        	System.out.println("A");
        }
        else if(score<=89&&score>=80)
        {
        	System.out.println("B");
        }
        else if(score<=79&&score>=70)
        {
        	System.out.println("C");
        }
        else if(score<=69&&score>=60)
        {
        	System.out.println("D");
        }
        else {
        	System.out.println("F");
        }
        
        sc.close();
        
        
	}

}
