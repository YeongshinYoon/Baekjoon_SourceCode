//������ȣ		2981
//�����̸�		�˹�
//�����з�		����/�ܰ躰�� Ǯ���/19_���� 3
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Arrays;
import java.util.Scanner;

public class Math3_5_2981 {
	public static void main(String[] args) {
		int n;
		int ns[];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		ns = new int[n];
		for (int i=0; i<n; i++)
			ns[i] = s.nextInt();
		s.close();
		
		Arrays.sort(ns);
		for (int i=0; i<n-1; i++)
			ns[i] = Math.abs(ns[i] - ns[i+1]);
		
		for (int i=1; i<n-1; i++) {
			for (int j=0; j<n-1-i; j++) {
				ns[j] = calc_gcd(ns[j], ns[j+1]);
			}
		}
		
		for (int i=2; i<=ns[0]; i++) {
			if (ns[0]%i == 0)
				System.out.print(i + " ");
		}
	}
	
	public static int calc_gcd(int n1, int n2) {
		int temp, a, b;
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
