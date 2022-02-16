import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {   // 여러 수를 입력받기위해 무한루프 사용
            int N = Integer.parseInt(br.readLine()); //숫자 입력받음
            if (N != 0) { // 0일경우 종료 하기위해 if else사용
                answer(N); // answer 함수에 N

            }
            else{
                break;
            }
        }

    }
    public static void answer(int N)
    {
          String num = Integer.toString(N); // 입력 받은 숫자를 split하기 위해 string 으로 형변환
          String check[] = new String[num.length()]; // 숫자를 뒤집기 위한 배열
          String arr[] = num.split(""); // num 문자열을 배열로 바꿈
          int l = num.length(); // arr 배열의 제일 뒤 부터 check 에 넣기 위해 변수 l생성
          for(int i=0;i<num.length();i++)
          {
              check[i] = arr[l-1]; //check에 arr을 뒤집어서 넣어줌
              l--;
          }
          if(Arrays.deepEquals(arr,check)) //두 배열의 값을 비교하기 위한 Arrays.deepEquals함수 사용
          {
              System.out.println("yes");
          }else
          {
              System.out.println("no");
          }
    }
}
