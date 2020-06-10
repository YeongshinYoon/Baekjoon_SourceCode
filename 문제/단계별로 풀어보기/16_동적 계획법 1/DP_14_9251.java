//문제번호		9251
//문제이름		LCS
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class DP_14_9251 {
	public static void main(String[] args) {
		String str1;
		String str2;
		int count[][];
		Scanner s = new Scanner(System.in);
		
		str1 = s.next();
		str2 = s.next();
		count = new int[str1.length()+1][str2.length()+1];
		s.close();
		
		for (int i=1; i<=str1.length(); i++) {
			for (int j=1; j<=str2.length(); j++) {
				if (str1.charAt(i-1) == str2.charAt(j-1)) {
					count[i][j] = count[i-1][j-1] + 1;
				} else {
					count[i][j] = Math.max(count[i-1][j], count[i][j-1]);
				}
			}
		}
		
		System.out.println(count[str1.length()][str2.length()]);
	}
}