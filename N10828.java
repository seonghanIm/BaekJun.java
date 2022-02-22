    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Stack;
    import java.util.StringTokenizer;

    public class N10828 {
        static Stack<Integer> s = new Stack<>();
        static int top;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            String com;
            int p=0;
            StringTokenizer st;
            for(int i=0;i<N;i++)
            {
                st = new StringTokenizer(br.readLine());

                if(st.countTokens()==2)
                {
                    com = st.nextToken();
                    p = Integer.parseInt(st.nextToken());
                    solution_push(com,p);
                }else
                {
                    com = st.nextToken();
                    solution(com);
                }
            }
        }

        public static void solution_push(String com, int p)
        {
            s.push(p);
            top = p;
        }
        public static  void solution(String com)
        {
            if(com.equals("pop"))
            {
                if(s.empty())
                {
                    System.out.println(-1);
                }else {
                    System.out.println(s.pop());
                }
            }else if(com.equals("size"))
            {
                System.out.println(s.size());
            }else if(com.equals("empty"))
            {
                if(s.empty())
                {
                    System.out.println(1);
                }else
                {
                    System.out.println(0);
                }
            }else if(com.equals("top"))
            {
                if(s.empty()){
                    System.out.println(-1);
                }else {
                    System.out.println(s.peek());
                }
            }
        }

    }
