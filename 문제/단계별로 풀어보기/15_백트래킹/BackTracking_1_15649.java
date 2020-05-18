//문제번호		15649
//문제이름		N과 M (1)
//문제분류		문제/단계별로 풀어보기/15_백트래킹
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class BackTracking_1_15649 {
	static int arr[];
	static boolean visit[];
	public static void main(String[] args) {
		int n, m;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		arr = new int[m];
		visit = new boolean[n+1];
		
		dfs(n, m, 0);
		
		s.close();
	}
	
	public static void dfs(int n, int m, int d) {
		if (m == d) {
			for (int i=0; i<m; i++) System.out.print(arr[i] + " ");
			System.out.println();
			return;
		}
		for (int i=1; i<=n; i++) {
			if (!visit[i]) {
				arr[d] = i;
				visit[i] = true;
				dfs(n, m, d+1);
				visit[i] = false;
			}
		}
	}
}