import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1929 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i=M;i<=N;i++)
        {
            if(func(i)==false&&i!=1)
            {
                System.out.println(i);
            }


        }

    }
    public static boolean func(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return true;
        }
        return false;

    }
}