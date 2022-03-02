import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        String s;
        int num;
        int answer;
        for(int i=0;i<N;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(st.countTokens()==2)
            {
                s = st.nextToken();
                num = Integer.parseInt(st.nextToken());
                solution1(s,num,stack);

            }else
            {
                s = st.nextToken();
                answer = solution(s,stack);
                System.out.println(answer);
            }
        }
    }

    public static int solution(String s,Deque<Integer> stack)
    {
        int re = 0;
        switch (s){
            case "pop_front":
                if(stack.isEmpty())
                {
                    re = -1;
                }else {
                    re = stack.removeFirst();
                }
                break;

            case "pop_back":
                if(stack.isEmpty())
                {
                    re = -1;
                }else {
                    re = stack.removeLast();
                }
                break;

            case "size":
                re = stack.size();
                break;

            case "empty":
                if(stack.isEmpty())
                {
                    re = 1;
                }else
                {
                    re = 0;
                }
                break;
            case "front":
                if(stack.isEmpty())
                {
                    re = -1;
                }else
                {
                    re = stack.peekFirst();
                }
                break;
            case "back":
                if(stack.isEmpty())
                {
                    re = -1;
                }
                else
                {
                    re = stack.peekLast();
                }
                break;

        }
        
        return re;

    }
    public static void solution1(String s, int num, Deque<Integer> stack)
    {
        switch (s)
        {
            case "push_front" :
                stack.addFirst(num);
                break;

            case "push_back" :
                stack.addLast(num);
                break;
        }
    }
}
