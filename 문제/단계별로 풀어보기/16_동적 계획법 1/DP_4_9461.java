//������ȣ		9461
//�����̸�		�ĵ��� ����
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_4_9461 {
	public static void main(String[] args) {
		int t, n;
		long arr[] = new long[101];
		Scanner s = new Scanner(System.in);
		
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		for (int j=4; j<=100; j++) {
			arr[j] = arr[j-3] + arr[j-2];
		}
		t = s.nextInt();
		for (int i=0; i<t; i++) {
			n = s.nextInt();
			System.out.println(arr[n]);
		}
		s.close();
	}
}