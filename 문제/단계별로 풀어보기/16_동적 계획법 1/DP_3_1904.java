//������ȣ		1904
//�����̸�		01Ÿ��
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_3_1904 {
	public static void main(String[] args) {
		int n;
		long arr[];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		s.close();
		arr = new long[n+2];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		for (int i=3; i<=n; i++) {
			arr[i] = arr[i-2]%15746 + arr[i-1]%15746;
		}
		System.out.println(arr[n]%15746);
	}
}