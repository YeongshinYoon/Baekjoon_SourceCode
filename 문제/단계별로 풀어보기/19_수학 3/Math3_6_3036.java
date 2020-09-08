//문제번호		3036
//문제이름		링
//문제분류		문제/단계별로 풀어보기/19_수학 3
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class Math3_6_3036 {
	public static void main(String[] args) {
		int n;
		int rs[];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		rs = new int[n];
		for (int i=0; i<n; i++)
			rs[i] = s.nextInt();
		s.close();
		
		for (int i=1; i<n; i++) {
			int gcd = calc_gcd(rs[0], rs[i]);
			System.out.print(rs[0] / gcd);
			System.out.print("/");
			System.out.println(rs[i] / gcd);
		}
	}
	
	public static int calc_gcd(int n1, int n2) {
		int a, b, temp;
		if (n1 >= n2) {
			a = n1;
			b = n2;
		}
		else {
			a = n2;
			b = n1;
		}
		
		while (true) {
			temp = a%b;
			if (temp == 0) return b;
			a = b;
			b = temp;
		}
	}
}
