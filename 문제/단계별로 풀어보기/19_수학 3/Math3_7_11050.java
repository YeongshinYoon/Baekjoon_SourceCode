//문제번호		11050
//문제이름		이항 계수 1
//문제분류		문제/단계별로 풀어보기/19_수학 3
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class Math3_7_11050 {
	public static void main(String[] args) {
		int n, k;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		k = s.nextInt();
		s.close();
		
		System.out.println(Combination_recursive(n, k));
	}
	
	public static int Combination_recursive(int n1, int n2) {
		if (n2 == 0 || n1 == n2) return 1;
		if (n2 == 1) return n1;
		return Combination_recursive(n1-1, n2-1) + Combination_recursive(n1-1, n2);
	}
}
