//������ȣ		10844
//�����̸�		���� ��� ��
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_9_10844 {
	public static void main(String[] args) {
		int n;
		long arr[][];
		long answer;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		s.close();
		arr = new long[n+1][10];
		
		for (int i=1; i<=9; i++)
			arr[1][i] = 1;
		if (n >= 2) {
			arr[2][1] = arr[1][1] + arr[1][2];
			for (int j=2; j<=8; j++) {
				arr[2][j] = arr[1][j-1] + arr[1][j+1];
			}
			arr[2][9] = arr[1][8];
			if (n >= 3) {
				for (int i=3; i<=n; i++) {
					arr[i][1] = (arr[i-2][1] + arr[i-1][2])%1000000000;
					for (int j=2; j<=8; j++) {
						arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1])%1000000000;
					}
					arr[i][9] = arr[i-1][8]%1000000000;
				}
			}
		}
		
		answer = 0;
		for (int i=1; i<=9; i++) {
			answer += arr[n][i];
			answer %= 1000000000;
		}
		
		System.out.println(answer);
	}
}