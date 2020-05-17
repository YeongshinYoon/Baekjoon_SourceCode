//문제번호		1181
//문제이름		단어 정렬
//문제분류		문제/단계별로 풀어보기/14_정렬
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Sorting_8_1181 {
	public static void main(String[] args) {
		int n;
		String arr[];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		arr = new String[n];
		for (int i=0; i<n; i++)
		{
			arr[i] = s.next();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		for (int i=0; i<n; i++)
		{
			int j;
			int len1 = arr[i].length();
			for (j=i+1; j<n; j++)
			{
				int len2 = arr[j].length();
				if (len1 != len2) break;
			}
			
			Arrays.sort(arr, i, j);
			i = j - 1;
		}
		
		System.out.println(arr[0]);
		for (int i=1; i<n; i++)
		{
			if (arr[i-1].equals(arr[i])) continue;
			System.out.println(arr[i]);
		}
		
		s.close();
	}
}