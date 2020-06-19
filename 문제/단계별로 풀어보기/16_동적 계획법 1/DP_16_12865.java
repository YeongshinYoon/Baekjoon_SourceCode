//������ȣ		12865
//�����̸�		����� �賶
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_16_12865 {
	public static void main(String[] args) {
		int n, k;
		int w[];
		int v[];
		int cost[][];
		int max_v = Integer.MIN_VALUE;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		k = s.nextInt();
		w = new int[n+1];
		v = new int[n+1];
		cost = new int[n+1][k+1];
		for (int i=1; i<=n; i++) {
			w[i] = s.nextInt();
			v[i] = s.nextInt();
		}
		s.close();
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=k; j++)
			{
				cost[i][j] = cost[i-1][j];
				if (j >= w[i]) {
					cost[i][j] = Math.max(cost[i-1][j], cost[i-1][j-w[i]] + v[i]);
				}
				if (max_v < cost[i][j]) max_v = cost[i][j];
			}
		}
		
		System.out.println(max_v);
	}
}