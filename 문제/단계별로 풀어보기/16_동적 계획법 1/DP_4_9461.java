//문제번호		9461
//문제이름		파도반 수열
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class DP_4_9461 {
	public static void main(String[] args) {
		int t, n;
		long arr[] = new long[101];
		Scanner s = new Scanner(System.in);
		
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		for (int j=4; j<=100; j++) {
			arr[j] = arr[j-3] + arr[j-2];
		}
		t = s.nextInt();
		for (int i=0; i<t; i++) {
			n = s.nextInt();
			System.out.println(arr[n]);
		}
		s.close();
	}
}