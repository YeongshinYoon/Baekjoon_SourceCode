//문제번호		1904
//문제이름		01타일
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class DP_3_1904 {
	public static void main(String[] args) {
		int n;
		long arr[];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		s.close();
		arr = new long[n+2];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		for (int i=3; i<=n; i++) {
			arr[i] = arr[i-2]%15746 + arr[i-1]%15746;
		}
		System.out.println(arr[n]%15746);
	}
}