//������ȣ		1463
//�����̸�		1�� �����
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_8_1463 {
	public static void main(String[] args) {
		int n;
		int arr[];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		s.close();
		arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 0;
		for (int i=2; i<=n; i++) {
			if (i%2 == 0) {
				if (i%3 == 0)
					arr[i] = Math.min(Math.min(arr[i-1], arr[i/2]), arr[i/3]) + 1;
				else arr[i] = Math.min(arr[i-1], arr[i/2]) + 1;
			}
			else {
				if (i%3 == 0)
					arr[i] = Math.min(arr[i-1], arr[i/3]) + 1;
				else arr[i] = arr[i-1] + 1;
			}
		}
		
		System.out.println(arr[n]);
	}
}