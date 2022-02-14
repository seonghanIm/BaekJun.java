    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class N13548 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            long N = Integer.parseInt(br.readLine()); // 시험장의 갯수
            long answer=N;
            long[] A = new long[(int)N]; //각 시험장 응시자의 수
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++)
            {
                A[i]=Integer.parseInt(st.nextToken());
            }
            int B; int C;
            st = new StringTokenizer(br.readLine());

            B = Integer.parseInt(st.nextToken()); // 총 감독관 감시 학생 수
            C = Integer.parseInt(st.nextToken()); // 부 감독관 감시 학생 수

            for(int i=0;i<N;i++)
            {
                if(A[i]-B<0)
                {
                    A[i]=0;
                }else
                {
                    A[i] = A[i]-B;
                }

            }
            for(int i=0;i<N;i++)
            {
                if(A[i]%C>0)
                {
                    answer = answer+(A[i]/C)+1;
                }else
                {
                    answer = answer+(A[i]/C);
                }
            }

            System.out.println(answer);



        }
    }
