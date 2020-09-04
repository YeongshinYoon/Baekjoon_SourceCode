//문제번호		11399
//문제이름		ATM
//문제분류		문제/단계별로 풀어보기/18_그리디 알고리즘
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_3_11399 {
	public static void main(String[] args) {
		int n;
		int time[];
		int sum;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		time = new int[n];
		for (int i=0; i<n; i++)
			time[i] = s.nextInt();
		s.close();
		
		Arrays.sort(time);
		
		//DP
		
		//Greedy
		sum = 0;
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<=i; j++)
				sum += time[j];
		}
		
		System.out.println(sum);
	}
}
