//문제번호		5086
//문제이름		배수와 약수
//문제분류		문제/단계별로 풀어보기/19_수학 3
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class Math3_1_5086 {
	public static void main(String[] args) {
		int n1, n2;
		Scanner s = new Scanner(System.in);
		
		while (true) {
			n1 = s.nextInt();
			n2 = s.nextInt();
			
			if (n1 == 0 && n2 == 0) break;
			
			if (n2%n1 == 0) System.out.println("factor");
			else if (n1%n2 == 0) System.out.println("multiple");
			else System.out.println("neither");
		}
		s.close();
	}
}
