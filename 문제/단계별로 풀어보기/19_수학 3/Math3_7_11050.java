//������ȣ		11050
//�����̸�		���� ��� 1
//�����з�		����/�ܰ躰�� Ǯ���/19_���� 3
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

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
