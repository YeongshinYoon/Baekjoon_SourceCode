//������ȣ		5086
//�����̸�		����� ���
//�����з�		����/�ܰ躰�� Ǯ���/19_���� 3
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class Math3_1_5086 {
	public static void main(String[] args) {
		int n1, n2;
		Scanner s = new Scanner(System.in);
		
		while (true) {
			n1 = s.nextInt();
			n2 = s.nextInt();
			
			if (n1 == 0 && n2 == 0) break;
			
			if (n2%n1 == 0) System.out.println("factor");
			else if (n1%n2 == 0) System.out.println("multiple");
			else System.out.println("neither");
		}
		s.close();
	}
}
