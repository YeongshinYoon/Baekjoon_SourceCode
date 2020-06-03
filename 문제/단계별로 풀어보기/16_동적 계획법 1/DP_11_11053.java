//문제번호		11053
//문제이름		가장 긴 증가하는 부분 수열
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class DP_11_11053 {
	public static void main(String[] args) {
		int n;
		int arr[];
		int count[];
		int max_count;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		arr = new int[n+1];
		count = new int[n+1];
		for (int i=1; i<=n; i++)
			arr[i] = s.nextInt();
		s.close();

		count[1] = 1;
		for (int i=2; i<=n; i++) {
			count[i] = 1;
			for (int j=1; j<i; j++) {
				if (arr[i] > arr[j] && count[i] < count[j]+1) {
					count[i] = count[j]+1;
				}
			}
		}
		
		max_count = count[1];
		for (int i=2; i<=n; i++) {
			if (max_count < count[i])
				max_count = count[i];
		}
		
		System.out.println(max_count);
	}
}