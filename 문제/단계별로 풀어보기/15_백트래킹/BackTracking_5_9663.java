//문제번호		9663
//문제이름		N-Queen
//문제분류		문제/단계별로 풀어보기/15_백트래킹
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class BackTracking_5_9663 {
	static int visit_col[];
	static int visit_diag1[];
	static int visit_diag2[];
	static int count;
	
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		s.close();
		
		visit_col = new int[n+1];
		visit_diag1 = new int[2*n+1];
		visit_diag2 = new int[2*n+1];
		count = 0;
		
		dfs(n, 0);
		System.out.println(count);
	}
	
	public static void dfs(int n, int r) {
		if (n == r) {
			count++;
			return;
		}
		
		for (int c=1; c<=n; c++) {
			if (isValid(n, r, c)) {
				visit_col[c] = 1;
				visit_diag1[r+c] = 1;
				visit_diag2[r+n-c] = 1;
					
				dfs(n, r+1);
					
				visit_col[c] = 0;
				visit_diag1[r+c] = 0;
				visit_diag2[r+n-c] = 0;
			}
		}
	}
	
	public static boolean isValid(int n, int i, int j) {
		if (visit_col[j] == 1) return false;
				
		if (visit_diag1[i+j] == 1) return false;
		if (visit_diag2[i+n-j] == 1) return false;
		return true;
	}
}