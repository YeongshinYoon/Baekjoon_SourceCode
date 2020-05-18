//문제번호		15651
//문제이름		N과 M (3)
//문제분류		문제/단계별로 풀어보기/15_백트래킹
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class BackTracking_3_15651 {
	static int arr[];
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		int n, m;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		arr = new int[m];
		visit = new boolean[n+1];
		
		dfs(n, m, 0);
		System.out.print(sb);
		
		s.close();
	}
	
	public static void dfs(int n, int m, int d) {
		if (m == d) {
			for (int a : arr) sb.append(a + " ");
			sb.append("\n");
			return;
		}
		for (int i=1; i<=n; i++) {
			if (!visit[i]) {
				arr[d] = i;
				if (d > m-1) visit[i] = true;
				dfs(n, m, d+1);
				visit[i] = false;
			}
		}
	}
}