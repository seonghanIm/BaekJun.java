import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2525 {
    public static void main(String[] args) throws IOException {
        int h,m;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        m = m+N;
            while(m>=60) {
                if (m >= 60) {
                    h++;
                    m -=60;
                    if (m == 60) {
                        m = 0;
                        h++;
                    }
                } else {
                    m = m + N;
                }
            }
            if(h>24)
            {
                h-=24;
            }else if(h==24)
            {
                h=0;
            }

        System.out.println(h+" "+m);


    }

}
