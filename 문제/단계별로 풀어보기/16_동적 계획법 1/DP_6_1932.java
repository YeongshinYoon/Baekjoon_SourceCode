//문제번호		1932
//문제이름		정수 삼각형
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class DP_6_1932 {
	public static void main(String[] args) {
		int n;
		long cost[][];
		long arr[][];
		long cost_max;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		cost = new long[n+1][n+1];
		arr = new long[n+1][n+1];
		
		arr[0][1] = 0;
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
				cost[i][j] = s.nextInt();
			
			arr[i][1] = arr[i-1][1] + cost[i][1];
			for (int j=2; j<i; j++)
				arr[i][j] = Math.max(arr[i-1][j-1], arr[i-1][j]) + cost[i][j];
			arr[i][i] = arr[i-1][i-1] + cost[i][i];
		}
		s.close();
		
		cost_max = arr[n][1];
		for (int i=2; i<=n; i++)
			cost_max = Math.max(cost_max, arr[n][i]);
		System.out.println(cost_max);
	}
}