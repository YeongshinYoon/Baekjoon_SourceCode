//문제번호		10773
//문제이름		제로
//문제분류		문제/단계별로 풀어보기/20_스택
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

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
