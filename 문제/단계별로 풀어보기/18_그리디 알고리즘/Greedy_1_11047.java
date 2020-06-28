//문제번호		11047
//문제이름		동전 0
//문제분류		문제/단계별로 풀어보기/18_그리디 알고리즘
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;

public class Greedy_1_11047 {
	public static void main(String[] args) {
		int n, k;
		int value[];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		k = s.nextInt();
		
		value = new int[n];
		for (int i=0; i<n; i++)
			value[i] = s.nextInt();
		s.close();
		//Greedy
		int temp = k;
		int count = 0;
		int index = n-1;
		while (true)
		{
			if (temp == 0) break;
			for (int i=index; i>=0; i--)
			{
				if (temp >= value[i])
				{
					temp -= value[i];
					count++;
					index = i;
					break;
				}
			}
		}
		
		System.out.println(count);
	}
}
