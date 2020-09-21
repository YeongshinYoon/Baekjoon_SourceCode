//������ȣ		10828
//�����̸�		����
//�����з�		����/�ܰ躰�� Ǯ���/20_����
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

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
