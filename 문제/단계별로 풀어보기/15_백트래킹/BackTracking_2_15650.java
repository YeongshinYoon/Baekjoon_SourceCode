//������ȣ		15650
//�����̸�		N�� M (2)
//�����з�		����/�ܰ躰�� Ǯ���/15_��Ʈ��ŷ
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class BackTracking_2_15650 {
	static int arr[];
	static boolean visit[];
	
	public static void main(String[] args) {
		int n, m;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		
		arr = new int[m];
		visit = new boolean[n+1];
		
		dfs(n, m, 0);
		
		s.close();
	}
	
	public static void dfs(int n, int m, int d) {
		if (m == d) {
			for (int i=0; i<m; i++) System.out.print(arr[i] + " ");
			System.out.println();
			return;
		}
		
		for (int i=1; i<=n; i++) {
			if (!visit[i]) {
				if (d == 0 || (d > 0 && arr[d-1] < i)) {
					arr[d] = i;
					visit[i] = true;
					dfs(n, m, d+1);
					visit[i] = false;
				}
			}
		}
	}
}