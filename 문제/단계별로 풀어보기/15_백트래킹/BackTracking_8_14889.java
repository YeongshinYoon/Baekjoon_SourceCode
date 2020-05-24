//������ȣ		14889
//�����̸�		��ŸƮ�� ��ũ
//�����з�		����/�ܰ躰�� Ǯ���/15_��Ʈ��ŷ
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class BackTracking_8_14889 {
	static int status[][];
	static boolean visit[];
	static int min = Integer.MAX_VALUE;
	static int n;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		status = new int[n][n];
		visit = new boolean[n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				status[i][j] = s.nextInt();
			}
		}
		s.close();
		
		dfs(0, 0);
		System.out.println(min);
	}
	
	public static void dfs(int s, int c) {
		//start�� true�� ǥ�����ָ� ������ false�� �ڵ����� link
		if (c == n/2) {
			int sum_start = 0;
			int sum_link = 0;
			
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					if (i == j) continue;
					//true : start
					if (visit[i] && visit[j])
						sum_start += status[i][j];
					//false : link
					else if (!visit[i] && !visit[j])
						sum_link += status[i][j];
				}
			}
			
			if (Math.abs(sum_start - sum_link) < min)
				min = Math.abs(sum_start - sum_link);
		}
		
		for (int i=s; i<n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				dfs(i+1, c+1);
				visit[i] = false;
			}
		}
	}
}