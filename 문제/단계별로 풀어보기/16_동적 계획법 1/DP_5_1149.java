//문제번호		1932
//문제이름		RGB거리
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class DP_5_1149 {
	public static void main(String[] args) {
		int n;
		int cost[][];
		int arr[][];
		int cost_min;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		cost = new int[n+1][3];
		arr = new int[n+1][n+1];
		
		arr[0][0] = 0;
		arr[0][1] = 0;
		arr[0][2] = 0;
		for (int i=1; i<=n; i++)
		{
			for (int j=0; j<3; j++)
				cost[i][j] = s.nextInt();
			arr[i][0] = Math.min(arr[i-1][1], arr[i-1][2]) + cost[i][0];
			arr[i][1] = Math.min(arr[i-1][0], arr[i-1][2]) + cost[i][1];
			arr[i][2] = Math.min(arr[i-1][0], arr[i-1][1]) + cost[i][2];
		}
		s.close();
		
		cost_min = Math.min(Math.min(arr[n][0], arr[n][1]), arr[n][2]);
		System.out.println(cost_min);
	}
}