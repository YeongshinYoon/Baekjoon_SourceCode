//������ȣ		2579
//�����̸�		��� ������
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_7_2579 {
	public static void main(String[] args) {
		int n;
		long cost[];
		long arr[];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		cost = new long[n+1];
		arr = new long[n+1];
		
		for (int i=1; i<=n; i++)
			cost[i] = s.nextInt();
		s.close();

		arr[0] = 0;
		arr[1] = cost[1];
		if (n >= 2) {
			arr[2] = cost[1] + cost[2];
			if (n >= 3) {
				arr[3] = Math.max(cost[1], cost[2]) + cost[3];
				for (int i=4; i<=n; i++)
					arr[i] = Math.max(arr[i-3]+cost[i-1], arr[i-2]) + cost[i];
			}
		}
		System.out.println(arr[n]);
	}
}