//������ȣ		10773
//�����̸�		����
//�����з�		����/�ܰ躰�� Ǯ���/20_����
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;
import java.util.Stack;

public class Stack_2_10773 {
	public static void main(String[] args) {
		int k;
		long n, sum;
		Stack<Long> stack = new Stack<>();
		Scanner s = new Scanner(System.in);
		
		sum = 0;
		k = s.nextInt();
		for (int i=0; i<k; i++) {
			n = s.nextInt();
			if (n == 0)
				sum -= stack.pop();
			else {
				stack.push(n);
				sum += n;
			}
		}
		s.close();
		
		System.out.println(sum);
	}
}
