//문제번호		10844
//문제이름		쉬운 계단 수
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

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