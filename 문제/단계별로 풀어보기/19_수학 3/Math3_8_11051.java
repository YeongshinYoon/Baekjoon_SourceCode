//문제번호		11051
//문제이름		이항 계수 2
//문제분류		문제/단계별로 풀어보기/19_수학 3
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class Math3_8_11051 {
	static int n, k;
	static long result[][];
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		k = s.nextInt();
		s.close();
		result = new long[n+1][k+1];
		
		System.out.println(Combination_iterative(n, k));
	}
	
	public static long Combination_iterative(int n1, int n2) {
		result[0][0] = 1;
		for (int i=1; i<=n; i++) {
			result[i][0] = 1;
			for (int j=1; j<=Math.min(i, k); j++) {
				result[i][j] = (result[i-1][j-1] + result[i-1][j])%10007;
			}
		}
		
		return result[n1][n2];
	}
}
