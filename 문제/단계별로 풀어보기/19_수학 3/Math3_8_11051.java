//������ȣ		11051
//�����̸�		���� ��� 2
//�����з�		����/�ܰ躰�� Ǯ���/19_���� 3
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

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
