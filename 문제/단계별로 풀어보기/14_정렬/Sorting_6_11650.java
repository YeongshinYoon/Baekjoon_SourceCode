//������ȣ		11650
//�����̸�		��ǥ �����ϱ�
//�����з�		����/�ܰ躰�� Ǯ���/14_����
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;
import java.util.Arrays;

public class Sorting_6_11650 {
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
			if (o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			} else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		for (int i=0; i<n; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
		
		s.close();
	}
}