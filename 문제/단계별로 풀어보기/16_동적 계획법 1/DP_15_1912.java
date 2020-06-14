//������ȣ		1912
//�����̸�		������
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_15_1912 {
	public static void main(String[] args) {
		int n;
		int list[];
		int cost[];
		int max_cost = Integer.MIN_VALUE;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		list = new int[n+1];
		cost = new int[n+1];
		for (int i=1; i<=n; i++)
			list[i] = s.nextInt();
		s.close();
		
		cost[1] = list[1];
		max_cost = cost[1];
		for (int i=2; i<=n; i++) {
			cost[i] = Math.max(list[i], cost[i-1]+list[i]);
			if (max_cost < cost[i]) max_cost = cost[i];
		}
		
		//�ð� �ʰ�
		/*for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				if (i == j) cost[i] = list[i];
				else cost[i] += list[j];
				if (max_cost < cost[i]) max_cost = cost[i];
			}
		}*/
		
		System.out.println(max_cost);
	}
}