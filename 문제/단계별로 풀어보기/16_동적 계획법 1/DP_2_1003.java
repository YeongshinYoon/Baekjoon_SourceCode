//������ȣ		1003
//�����̸�		�Ǻ���ġ �Լ�
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_2_1003 {
	public static void main(String[] args) {
		int n, t;
		Scanner s = new Scanner(System.in);
		
		t = s.nextInt();
		for (int i=0; i<t; i++)
		{
			n = s.nextInt();
			int f0[] = new int[n+2];
			int f1[] = new int[n+2];
			f0[0] = 1;
			f0[1] = 0;
			f1[0] = 0;
			f1[1] = 1;
			for (int j=2; j<=n; j++)
			{
				f0[j] = f0[j-2] + f0[j-1];
				f1[j] = f1[j-2] + f1[j-1];
			}
			System.out.println(f0[n] + " " + f1[n]);
		}
		s.close();
	}
}