import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class N2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for(int i=1;i<=N;i++)
        {
            q.add(i);
        }
        while(q.size()!=1)
        {
            func(q);
            func2(q);
        }
        System.out.println(q.peek());
    }

    public static void func(Queue<Integer>q)
    {
        q.remove();

    }
    public static void func2(Queue<Integer>q)
    {
        int num2 = q.poll();
        q.add(num2);
    }
}
