//문제번호		4949
//문제이름		균형잡힌 세상
//문제분류		문제/단계별로 풀어보기/20_스택
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;
import java.util.Stack;

public class Stack_4_4949 {
	public static void main(String[] args) {
		String str;
		boolean isVPS;
		int flag;
		Stack<Character> stack = new Stack<>();
		Scanner s = new Scanner(System.in);
		
		while (true) {
			str = s.nextLine();
			if (str.equals(".")) break;
			isVPS = true;
			flag = 0;
			stack.clear();
			for (int i=0; i<str.length(); i++) {
				if (str.charAt(i) == '(' || str.charAt(i) == '[')
					stack.push(str.charAt(i));
				else if (str.charAt(i) == ')') {
					if (stack.isEmpty())
						flag = 1;
					else if (stack.pop() != '(')
						flag = 1;
				}
				else if (str.charAt(i) == ']') {
					if (stack.isEmpty())
						flag = 1;
					else if (stack.pop() != '[')
						flag = 1;
				}
			}
			if (flag == 1 || !stack.isEmpty()) isVPS = false;
			if (isVPS) System.out.println("yes");
			else System.out.println("no");
		}
		s.close();
	}
}
