//������ȣ		2156
//�����̸�		������ �ý�
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_10_2156 {
	public static void main(String[] args) {
		int n;
		int arr[];
		int cost[];
		int max_wine;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		arr = new int[n+1];
		cost = new int[n+1];
		for (int i=1; i<=n; i++)
			arr[i] = s.nextInt();
		s.close();
		
		cost[1] = arr[1];
		max_wine = cost[1];
		if (n >= 2) {
			cost[2] = arr[1] + arr[2];
			max_wine = Math.max(max_wine, cost[2]);
			if (n >= 3) {
				cost[3] = Math.max(arr[1], arr[2]) + arr[3];
				max_wine = Math.max(max_wine, cost[3]);
				if (n >= 4) {
					cost[4] = Math.max(arr[1] + arr[3], cost[2]) + arr[4];
					max_wine = Math.max(max_wine, cost[4]);
					for (int i=5; i<=n; i++) {
						//1. ���� ���� ���ð� 3ĭ ���� ���� ���� ���
						//2. ���� ���� ���ð� 2ĭ ���� ���� ���� ���
						//3. 2ĭ ���� ���� ���� ���
						cost[i] = Math.max(Math.max(cost[i-4] + arr[i-1], cost[i-3] + arr[i-1]), cost[i-2]) + arr[i];
						max_wine = Math.max(max_wine, cost[i]);
					}
				}
			}
		}
		
		System.out.println(max_wine);
	}
}