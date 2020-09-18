//������ȣ		1676
//�����̸�		���丮�� 0�� ����
//�����з�		����/�ܰ躰�� Ǯ���/19_���� 3
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class Math3_10_1676 {
	public static void main(String[] args) {
		int n;
		int count2;
		int count5;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		s.close();
		
		count2 = 0;
		count5 = 0;
		
		for (int i=2; i<=n; i++)
		{
			count2 += countOfNum(2, i);
			count5 += countOfNum(5, i);
		}
		
		System.out.println(Math.min(count2, count5));
	}
	
	public static int countOfNum(int a, int n) {
		int count = 0;
		
		while (true) {
			if (n%a == 0) count++;
			else break;
			n /= a;
		}
		
		return count;
	}
}
