//������ȣ		9012
//�����̸�		��ȣ
//�����з�		����/�ܰ躰�� Ǯ���/20_����
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

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
