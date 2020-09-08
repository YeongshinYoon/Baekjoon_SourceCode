//������ȣ		3036
//�����̸�		��
//�����з�		����/�ܰ躰�� Ǯ���/19_���� 3
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class Math3_6_3036 {
	public static void main(String[] args) {
		int n;
		int rs[];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		rs = new int[n];
		for (int i=0; i<n; i++)
			rs[i] = s.nextInt();
		s.close();
		
		for (int i=1; i<n; i++) {
			int gcd = calc_gcd(rs[0], rs[i]);
			System.out.print(rs[0] / gcd);
			System.out.print("/");
			System.out.println(rs[i] / gcd);
		}
	}
	
	public static int calc_gcd(int n1, int n2) {
		int a, b, temp;
		if (n1 >= n2) {
			a = n1;
			b = n2;
		}
		else {
			a = n2;
			b = n1;
		}
		
		while (true) {
			temp = a%b;
			if (temp == 0) return b;
			a = b;
			b = temp;
		}
	}
}
