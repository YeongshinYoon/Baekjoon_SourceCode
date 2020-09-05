//문제번호		1037
//문제이름		약수
//문제분류		문제/단계별로 풀어보기/19_수학 3
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Arrays;
import java.util.Scanner;

public class Math3_2_1037 {
	public static void main(String[] args) {
		int n;
		int ns[];
		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		ns = new int[n];
		for (int i=0; i<n; i++)
			ns[i] = s.nextInt();
		s.close();
		
		Arrays.sort(ns);
		System.out.println(ns[0]*ns[n-1]);
	}
}
