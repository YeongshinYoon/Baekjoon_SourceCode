//문제번호		1931
//문제이름		회의실배정
//문제분류		문제/단계별로 풀어보기/18_그리디 알고리즘
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2_1931 {
	public static void main(String[] args) {
		int n;
		int time[][];
		int index, count;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		time = new int[n][2];
		for (int i=0; i<n; i++)
		{
			time[i][0] = s.nextInt();
			time[i][1] = s.nextInt();
		}
		s.close();
		
		Arrays.sort(time, (o1, o2) -> {
			if (o1[0] == o2[0]) {
				return -Integer.compare(o1[1], o2[1]);
			} else {
				return -Integer.compare(o1[0], o2[0]);
			}
		});
		
		//DP
		
		//Greedy
		count = 1;
		int i;
		index = 0;
		while (true)
		{
			for (i=index+1; i<n; i++)
			{
				if (time[i][1] <= time[index][0])
				{
					count++;
					index = i;
					break;
				}
			}
			
			if (i == n) break;
		}
		
		System.out.println(count);
	}
}

