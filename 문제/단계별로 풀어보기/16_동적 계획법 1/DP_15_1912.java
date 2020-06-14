//문제번호		1912
//문제이름		연속합
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class DP_15_1912 {
	public static void main(String[] args) {
		int n;
		int list[];
		int cost[];
		int max_cost = Integer.MIN_VALUE;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		list = new int[n+1];
		cost = new int[n+1];
		for (int i=1; i<=n; i++)
			list[i] = s.nextInt();
		s.close();
		
		cost[1] = list[1];
		max_cost = cost[1];
		for (int i=2; i<=n; i++) {
			cost[i] = Math.max(list[i], cost[i-1]+list[i]);
			if (max_cost < cost[i]) max_cost = cost[i];
		}
		
		//시간 초과
		/*for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				if (i == j) cost[i] = list[i];
				else cost[i] += list[j];
				if (max_cost < cost[i]) max_cost = cost[i];
			}
		}*/
		
		System.out.println(max_cost);
	}
}