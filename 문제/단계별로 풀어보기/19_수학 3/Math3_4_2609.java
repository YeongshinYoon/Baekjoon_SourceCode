//문제번호		2609
//문제이름		최대공약수와 최소공배수
//문제분류		문제/단계별로 풀어보기/19_수학 3
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class Math3_4_2609 {
	public static void main(String[] args) {
		int n1, n2;
		int gcd = 0, lcm = 0;
		Scanner s = new Scanner(System.in);

		n1 = s.nextInt();
		n2 = s.nextInt();
		s.close();
		
		for (int i=1; i<=Math.min(n1, n2); i++)
		{
			if (n1%i == 0 && n2%i == 0)
				gcd = i;
		}
		lcm = gcd * (n1/gcd) * (n2/gcd);
		
		System.out.println(gcd);
		System.out.println(lcm);
	}
}
