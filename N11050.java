import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        if(num2==0)
        {
            System.out.println(1);
        }else if(num1==num2)
        {
            System.out.println(1);
        }
        else {

            solution(num1, num2);

        }



    }
    public static int factorial(int n)
    {
        int tmp=n;
        if(n==0) return 0;
        else
        {
            for(int i=2;i<tmp;i++)
                n = n*i;
        }
        return n;
    }
    public static void solution(int num1,int num2)
    {

        int i = factorial(num1) / (factorial(num2) * factorial(num1 - num2));

        System.out.println(i);
    }

}
