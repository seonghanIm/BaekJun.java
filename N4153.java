import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int[] a = new int[3];
        while(true) {
            st = new StringTokenizer(br.readLine());
            a[0] = Integer.parseInt(st.nextToken());
            a[1] = Integer.parseInt(st.nextToken());
            a[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(a);
            if(a[0]==0)
            {
                break;
            }else
            {
                func(a[0],a[1],a[2]);
            }
        }


    }
    public static void func(int a,int b,int c){
        if(a*a+b*b==c*c)
        {
            System.out.println("right");
        }else
        {
            System.out.println("wrong");
        }

    }
}
