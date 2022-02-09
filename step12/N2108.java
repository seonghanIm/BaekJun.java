    import java.io.*;
    import java.util.*;

    public class N2108 {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            int[] numbers = new int[n];

            for(int i=0;i<n;i++)
            {
                numbers[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(numbers);
            System.out.println((int)avg(numbers));
            System.out.println(median(numbers));
            System.out.println(counting(numbers));
            System.out.println(range(numbers));


        }
        public static double avg(int[] arr)
        {
            double sum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i];
            }

            double result = (double)sum/arr.length;
            String formattedResult = String.format("%.1f", result);
            result = Math.round(result);
            return result;
        }
        public static int median(int[] arr)
        {
            Arrays.sort(arr);
            int index = arr.length/2;
            return arr[index];
        }

        public static int counting(int[] arr)
        {
            int[] check = new int[8001];
            int max = 0;
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<arr.length;i++)
            {
                check[arr[i]+4000]++;
            }
            for(int i = 0;i<check.length;i++)
            {
                if(check[i]>=max)
                {
                    max = check[i];
                }
            }
            for(int i = 0;i<check.length;i++)
            {
                if(check[i]==max)
                {
                    list.add(i-4000);
                }

            }
            if(list.size()==1)
            {
                return list.get(0);
            }
            else {
                Collections.sort(list);
                return list.get(1);

            }
        }
        public static int range(int[] arr)
        {
            return arr[arr.length-1] - arr[0];
        }

    }
