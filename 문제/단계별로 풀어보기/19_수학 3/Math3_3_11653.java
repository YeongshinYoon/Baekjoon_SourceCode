//문제번호		11653
//문제이름		소인수분해
//문제분류		문제/단계별로 풀어보기/19_수학 3
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class Math3_3_11653 {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		s.close();
		
		int temp = n;
		int index = 2;
		while (true)
		{
			for (int i=index; i<=n; i++)
			{
				if (temp%i == 0)
				{
					System.out.println(i);
					temp /= i;
					index = i;
					break;
				}
			}
			
			if (temp == 1) break;
		}
	}
}
