//문제번호		11651
//문제이름		좌표 정렬하기 2
//문제분류		문제/단계별로 풀어보기/14_정렬
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;
import java.util.Arrays;

public class Sorting_7_11651 {
	public static void main(String[] args) {
		int n;
		int arr[][];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		arr = new int[n][2];
		for (int i=0; i<n; i++)
		{
			arr[i][0] = s.nextInt();
			arr[i][1] = s.nextInt();
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			} else {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		for (int i=0; i<n; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
		
		s.close();
	}
}