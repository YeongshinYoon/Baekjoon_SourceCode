//������ȣ		11054
//�����̸�		���� �� ������� �κ� ����
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_12_11054 {
	static int n;
	static int arr[];
	public static void main(String[] args) {
		int increase_count[];
		int max_count;
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		arr = new int[n+1];
		increase_count = new int[n+1];
		for (int i=1; i<=n; i++)
			arr[i] = s.nextInt();
		s.close();

		
		increase_count[1] = 1;
		
		for (int i=2; i<=n; i++) {
			increase_count[i] = 1;
			for (int j=1; j<i; j++) {
				if (arr[i] > arr[j] && increase_count[i] < increase_count[j]+1) {
					increase_count[i] = increase_count[j]+1;
				}
			}
		}
		
		max_count = calc_decrease_count(1, n);
		for (int i=2; i<n-1; i++) {
			int temp = increase_count[i] + calc_decrease_count(i, n);
			if (max_count < temp) {
				max_count = temp;
				max_count--;
			}
		}
		if (max_count < increase_count[n])
			max_count = increase_count[n];
		
		System.out.println(max_count);
	}
	
	public static int calc_decrease_count(int start, int end) {
		int decrease_count[] = new int[n+1];
		int max;
		
		decrease_count[start] = 1;
		max = decrease_count[start];
		for (int i=start+1; i<=end; i++) {
			decrease_count[i] = 1;
			for (int j=start; j<end; j++) {
				if (arr[i] < arr[j] && decrease_count[i] < decrease_count[j]+1) {
					decrease_count[i] = decrease_count[j]+1;
				}
			}
			if (max < decrease_count[i]) max = decrease_count[i];
		}
		
		return max;
	}
}