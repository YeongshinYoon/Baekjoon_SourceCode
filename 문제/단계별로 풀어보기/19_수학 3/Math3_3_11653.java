//������ȣ		11653
//�����̸�		���μ�����
//�����з�		����/�ܰ躰�� Ǯ���/19_���� 3
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class Math3_3_11653 {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		s.close();
		
		int temp = n;
		int index = 2;
		while (true)
		{
			for (int i=index; i<=n; i++)
			{
				if (temp%i == 0)
				{
					System.out.println(i);
					temp /= i;
					index = i;
					break;
				}
			}
			
			if (temp == 1) break;
		}
	}
}
