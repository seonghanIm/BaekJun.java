import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class N9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++)
        {
            String s1 = br.readLine();
            char[] arr = s1.toCharArray();
            solution(arr);


        }








    }



    public static void solution(char[] s1)
    {
        Stack<String> s = new Stack<>();
        Boolean check=false;
        if (s1.length % 2 == 1 || s1[0]==')') {
            System.out.println("NO");
        }else {
            for (int i = 0; i < s1.length; i++) {
                if (s1[i]=='(') {
                    s.push("1");
                } else {
                    if(s.empty())
                    {
                        check = true;
                        break;
                    }else {
                        s.pop();
                    }
                }
            }
            if(!s.empty() || check)
            {
                System.out.println("NO");
            }else
            {
                System.out.println("YES");
            }

//            if (s.empty()) {
//                System.out.println("YES");
//            } else if(!s.empty()||check==true){
//                System.out.println("NO");
//            }
        }

    }
}
