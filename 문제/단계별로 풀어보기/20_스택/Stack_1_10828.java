//문제번호		10828
//문제이름		스택
//문제분류		문제/단계별로 풀어보기/20_스택
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Scanner;
import java.util.Stack;

public class Stack_1_10828 {
	public static void main(String[] args) {
		int n;
		String command;
		Stack<Integer> stack = new Stack<>();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		command = s.nextLine();
		for (int i=0; i<n; i++) {
			String[] splited;
			command = s.nextLine();
			splited = command.split(" ");
			switch (splited[0]) {
			case "push":
				stack.push(Integer.parseInt(splited[1]));
				break;
			case "top":
				if (stack.size() > 0)
					System.out.println(stack.get(stack.size()-1));
				else System.out.println("-1");
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "pop":
				if (stack.size() > 0)
					System.out.println(stack.pop());
				else System.out.println("-1");
				break;
			case "empty":
				if (stack.empty())
					System.out.println("1");
				else System.out.println("0");
				break;
			}
		}
		s.close();
	}
}
