//문제번호		2579
//문제이름		계단 오르기
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class DP_7_2579 {
	public static void main(String[] args) {
		int n;
		long cost[];
		long arr[];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		cost = new long[n+1];
		arr = new long[n+1];
		
		for (int i=1; i<=n; i++)
			cost[i] = s.nextInt();
		s.close();

		arr[0] = 0;
		arr[1] = cost[1];
		if (n >= 2) {
			arr[2] = cost[1] + cost[2];
			if (n >= 3) {
				arr[3] = Math.max(cost[1], cost[2]) + cost[3];
				for (int i=4; i<=n; i++)
					arr[i] = Math.max(arr[i-3]+cost[i-1], arr[i-2]) + cost[i];
			}
		}
		System.out.println(arr[n]);
	}
}