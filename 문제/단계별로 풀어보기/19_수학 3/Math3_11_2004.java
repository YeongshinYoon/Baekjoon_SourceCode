//������ȣ		2004
//�����̸�		���� 0�� ����
//�����з�		����/�ܰ躰�� Ǯ���/19_���� 3
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class Math3_11_2004 {
	public static void main(String[] args) {
		int n, m;
		long count2;
		long count5;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		s.close();
		
		count2 = 0;
		count5 = 0;
		
		for (long i=2; i<=n; i*=2)
			count2 += (n/i);
		for (long i=5; i<=n; i*=5)
			count5 += (n/i);
		
		for (long i=2; i<=m; i*=2)
			count2 -= (m/i);
		for (long i=5; i<=m; i*=5)
			count5 -= (m/i);
		
		for (long i=2; i<=(n-m); i*=2)
			count2 -= ((n-m)/i);
		for (long i=5; i<=(n-m); i*=5)
			count5 -= ((n-m)/i);
		
		System.out.println(Math.min(count2, count5));
	}
}
