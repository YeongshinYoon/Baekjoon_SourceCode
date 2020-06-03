//������ȣ		11053
//�����̸�		���� �� �����ϴ� �κ� ����
//�����з�		����/�ܰ躰�� Ǯ���/16_���� ��ȹ�� 1
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;

public class DP_11_11053 {
	public static void main(String[] args) {
		int n;
		int arr[];
		int count[];
		int max_count;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		arr = new int[n+1];
		count = new int[n+1];
		for (int i=1; i<=n; i++)
			arr[i] = s.nextInt();
		s.close();

		count[1] = 1;
		for (int i=2; i<=n; i++) {
			count[i] = 1;
			for (int j=1; j<i; j++) {
				if (arr[i] > arr[j] && count[i] < count[j]+1) {
					count[i] = count[j]+1;
				}
			}
		}
		
		max_count = count[1];
		for (int i=2; i<=n; i++) {
			if (max_count < count[i])
				max_count = count[i];
		}
		
		System.out.println(max_count);
	}
}