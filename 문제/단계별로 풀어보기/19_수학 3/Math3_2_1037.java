//������ȣ		1037
//�����̸�		���
//�����з�		����/�ܰ躰�� Ǯ���/19_���� 3
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Arrays;
import java.util.Scanner;

public class Math3_2_1037 {
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
		System.out.println(ns[0]*ns[n-1]);
	}
}
