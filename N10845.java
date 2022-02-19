import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N10845 {
    static int last = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a;
        int N,b;
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++)
        {
            st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            if(st.countTokens()==1) {
                b = Integer.parseInt(st.nextToken());
            }else
            {
                b=0;
            }

            division(a,b,q);
        }


    }

    public static void division(String a,int b, Queue q){
        if(a.equals("push"))
        {
            q.add(b);
            last = b;
        }else if(a.equals("pop"))
        {
            if(q.isEmpty())
            {
                System.out.println(-1);
            }else {

                System.out.println(q.poll());
            }
        }else if(a.equals("size"))
        {
            System.out.println(q.size());
        }else if(a.equals("empty"))
        {
            if(q.isEmpty())
            {
                System.out.println("1");
            }else
            {
                System.out.println("0");
            }
        }else if(a.equals("front"))
        {
            if(!q.isEmpty()) {
                System.out.println(q.peek());
            }else
            {
                System.out.println(-1);
            }
        }else if(a.equals("back"))
        {
            if(!q.isEmpty())
            {
                System.out.println(last);
            }else{
                System.out.println(-1);
            }
        }

    }
}
