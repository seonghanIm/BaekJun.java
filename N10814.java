import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.util.*;

public class N10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //사람 수
        StringTokenizer st;

        person[] p = new person[N]; // Person객체를 사람 수 만큼 생성

        for(int i=0;i<N;i++) //입력받음
        {
            st = new StringTokenizer(br.readLine());
            p[i] = new person(Integer.parseInt(st.nextToken()),st.nextToken());
        }

        Arrays.sort(p, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {  //comparator 를 사용하여 객체 값들을 비교함, 두 매개변수 빼서 양수 반환-> 자리 바꿈// 0 , 음수는 그대로
                return o1.age-o2.age;
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++)
        {
            sb.append(p[i]);
        }

        System.out.println(sb);



    }

    public static class person // Person객체 생성
    {
        int age;
        String name;

        public person(int age, String name)
        {
            this.age = age;
            this.name = name;
        }

        public String toString(){ //StringBuilder 사용을 위한 toString
            return age + " " + name + "\n";
        }
    }
}
