//문제번호		1676
//문제이름		팩토리얼 0의 개수
//문제분류		문제/단계별로 풀어보기/19_수학 3
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class Math3_10_1676 {
	public static void main(String[] args) {
		int n;
		int count2;
		int count5;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		s.close();
		
		count2 = 0;
		count5 = 0;
		
		for (int i=2; i<=n; i++)
		{
			count2 += countOfNum(2, i);
			count5 += countOfNum(5, i);
		}
		
		System.out.println(Math.min(count2, count5));
	}
	
	public static int countOfNum(int a, int n) {
		int count = 0;
		
		while (true) {
			if (n%a == 0) count++;
			else break;
			n /= a;
		}
		
		return count;
	}
}
