//������ȣ		2748
//�����̸�		�Ǻ���ġ �� 2
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

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