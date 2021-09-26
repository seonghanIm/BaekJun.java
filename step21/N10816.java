package step21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;



public class N10816 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // 상근이가 가진 카드의 수 
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int []card = new int[N]; // 상근이가 가진 카드의 배열 
	   
	    
	    for(int i=0;i<N;i++)
	    {
	    	card[i] = Integer.parseInt(st.nextToken());
	    }
	    Arrays.sort(card);
	    int M = Integer.parseInt(br.readLine()); // 비교대상 카드의 수 
	    StringTokenizer st2 = new StringTokenizer(br.readLine());
	    int []tarCard = new int[M]; // 비교대상 카드의 배열 
	    int []answer = new int[M];
	    for(int i=0;i<M;i++)
	    {
	    	tarCard[i]=Integer.parseInt(st2.nextToken());
	    }
	    
	    for(int i=0;i<M;i++)
	    {
	    		int result = BinarySearch(card,tarCard[i]);
	    		answer[i] = result;
	    	
	    	
	    }
	    for(int i=0;i<M;i++)
	    {
	    	bw.write(answer[i]+" ");;
	    }
	    
	    bw.flush();
	    bw.close();
	    
	    

	}
	
	public static int BinarySearch(int []arr, int target)
	{
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		
		int result = 0;
		while(low<=high)
		{
			mid = (low+high)/2;
			int left = mid-1;
			int right = mid+1;
			if(arr[mid]==target)
			{
			     result++;
			  while(left<arr.length&&right<arr.length&&left>=0)
			  {
			 
				  if(arr[right]==target&&arr[left]==target)
				  {
					  result = result+2;
					  left--;
					  right++;
				  } 
				  else if(arr[left]==target&&arr[right]!=target)
				  {
					  left--;
					  result++;
				  }
				  else if(arr[right]==target&&arr[left]!=target)
				  {
					  right++;
					  result++;
				  }
				  else if(arr[left]!=target&&arr[right]!=target)
				  {
				      break;
				  }else if(left>=arr.length||right>=arr.length)
				  {
				      break;
				  }
			  }return result;
				  
			 
			}else if(arr[mid]<target)
			{
				low = mid+1;
			}else if(arr[mid]>target)
			{
				high = mid-1;
			}
		}
		return result;
	}

}
