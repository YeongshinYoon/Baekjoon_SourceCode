//������ȣ		10814
//�����̸�		���̼� ����
//�����з�		����/�ܰ躰�� Ǯ���/14_����
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Sorting_9_10814 {
	public static void main(String[] args) {
		int n;
		String arr[][];
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		arr = new String[n][2];
		for (int i=0; i<n; i++)
		{
			arr[i][0] = s.next();
			arr[i][1] = s.next();
		}
		
		Arrays.sort(arr, Comparator.comparingInt(o1->Integer.parseInt(o1[0])));
		
		for (int i=0; i<n; i++)
		{
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		
		s.close();
	}
}