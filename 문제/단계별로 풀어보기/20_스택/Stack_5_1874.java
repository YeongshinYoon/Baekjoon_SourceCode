//문제번호		1874
//문제이름		스택 수열
//문제분류		문제/단계별로 풀어보기/20_스택
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;
import java.util.Stack;

public class Stack_5_1874 {
	public static void main(String[] args) {
		int n;
		int ns[];
		int last;
		Stack<Integer> stack = new Stack<>();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		ns = new int[n+1];
		for (int i=1; i<=n; i++)
			ns[i] = s.nextInt();
		s.close();
		
		stack.push(1);
		last = 1;
		StringBuilder sb = new StringBuilder();
		sb.append("+\n");
		for (int i=1; i<=n; i++) {
			for (int j=last+1; j<=ns[i]; j++) {
				stack.push(j);
				last = j;
				sb.append("+\n");
			}
			if (stack.pop() == ns[i])
				sb.append("-\n");
			else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println(sb);
	}
}
