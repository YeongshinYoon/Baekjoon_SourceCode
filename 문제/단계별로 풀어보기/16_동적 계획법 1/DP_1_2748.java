//문제번호		2748
//문제이름		피보나치 수 2
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class DP_1_2748 {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		s.close();
		
		long f[] = new long[n+2];
		f[0] = 0;
		f[1] = 1;
		for (int i=2; i<=n; i++) {
			f[i] = f[i-2] + f[i-1];
		}
		
		System.out.println(f[n]);
	}
}