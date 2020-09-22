//문제번호		9012
//문제이름		괄호
//문제분류		문제/단계별로 풀어보기/20_스택
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;
import java.util.Stack;

public class Stack_3_9012 {
	public static void main(String[] args) {
		int t;
		String str;
		boolean isVPS;
		int flag;
		Stack<Character> stack = new Stack<>();
		Scanner s = new Scanner(System.in);
		
		t = s.nextInt();
		for (int i=0; i<t; i++) {
			isVPS = true;
			flag = 0;
			str = s.next();
			stack.clear();
			for (int j=0; j<str.length(); j++) {
				if (str.charAt(j) == '(')
					stack.push(str.charAt(j));
				else {
					if (stack.isEmpty()) {
						flag = 1;
						break;
					}
					else stack.pop();
				}
			}
			if (flag == 1 || !stack.isEmpty()) isVPS = false;
			if (isVPS) System.out.println("YES");
			else System.out.println("NO");
		}
		s.close();
		
		
	}
}
