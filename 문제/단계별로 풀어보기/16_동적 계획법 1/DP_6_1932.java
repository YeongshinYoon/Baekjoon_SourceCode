//������ȣ		1932
//�����̸�		���� �ﰢ��
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_6_1932 {
	public static void main(String[] args) {
		int n;
		long cost[][];
		long arr[][];
		long cost_max;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		cost = new long[n+1][n+1];
		arr = new long[n+1][n+1];
		
		arr[0][1] = 0;
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
				cost[i][j] = s.nextInt();
			
			arr[i][1] = arr[i-1][1] + cost[i][1];
			for (int j=2; j<i; j++)
				arr[i][j] = Math.max(arr[i-1][j-1], arr[i-1][j]) + cost[i][j];
			arr[i][i] = arr[i-1][i-1] + cost[i][i];
		}
		s.close();
		
		cost_max = arr[n][1];
		for (int i=2; i<=n; i++)
			cost_max = Math.max(cost_max, arr[n][i]);
		System.out.println(cost_max);
	}
}