package bfs_dfs;
import java.util.*;
public class N2606 {
	
    static int [][] check;
    static boolean[] checked;
    static int n; // 컴퓨터의 수, 정점의 수 
    static int m; // 네트워크상 연결된 검퓨터 쌍의 수 , 간선의 수  
    static int start; // 초기 정점 (이 문제의 경우 1)
    static int count = 0;
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   n = sc.nextInt();
	   m = sc.nextInt();
	   start = 1;
	   
	   check = new int[101][101];
	   checked = new boolean[101];
	   
	   for(int i=0;i<m;i++)
	   {
		   int x=sc.nextInt();
		   int y=sc.nextInt();
		   
		   check[x][y] = check[y][x] = 1;
	   }
	   
	   dfs(start);
	   
	   System.out.println(count-1);
	   sc.close();

	}
	
	
	public static void dfs(int i)
	{
		checked[i] = true;
		count++;
		for(int j=1;j<=n;j++)
		{
			if(check[i][j]==1&&checked[j]==false)
			{
				dfs(j);
			}
		}
	}

}
