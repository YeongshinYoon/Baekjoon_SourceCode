//문제번호		2156
//문제이름		포도주 시식
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class DP_10_2156 {
	public static void main(String[] args) {
		int n;
		int arr[];
		int cost[];
		int max_wine;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		arr = new int[n+1];
		cost = new int[n+1];
		for (int i=1; i<=n; i++)
			arr[i] = s.nextInt();
		s.close();
		
		cost[1] = arr[1];
		max_wine = cost[1];
		if (n >= 2) {
			cost[2] = arr[1] + arr[2];
			max_wine = Math.max(max_wine, cost[2]);
			if (n >= 3) {
				cost[3] = Math.max(arr[1], arr[2]) + arr[3];
				max_wine = Math.max(max_wine, cost[3]);
				if (n >= 4) {
					cost[4] = Math.max(arr[1] + arr[3], cost[2]) + arr[4];
					max_wine = Math.max(max_wine, cost[4]);
					for (int i=5; i<=n; i++) {
						//1. 이전 잔을 마시고 3칸 전의 잔을 마신 경우
						//2. 이전 잔을 마시고 2칸 전의 잔을 마신 경우
						//3. 2칸 전의 잔을 마신 경우
						cost[i] = Math.max(Math.max(cost[i-4] + arr[i-1], cost[i-3] + arr[i-1]), cost[i-2]) + arr[i];
						max_wine = Math.max(max_wine, cost[i]);
					}
				}
			}
		}
		
		System.out.println(max_wine);
	}
}