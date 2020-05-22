//������ȣ		14888
//�����̸�		������ �����ֱ�
//�����з�		����/�ܰ躰�� Ǯ���/15_��Ʈ��ŷ
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.ArrayList;
import java.util.Scanner;

public class BackTracking_7_14888 {
	static int operands[];
	static ArrayList<Character> operators = new ArrayList<>();
	static boolean visit[];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		operands = new int[n];
		for (int i=0; i<n; i++)
			operands[i] = s.nextInt();
		int temp = s.nextInt();
		for (int i=0; i<temp; i++)
			operators.add('+');
		temp = s.nextInt();
		for (int i=0; i<temp; i++)
			operators.add('-');
		temp = s.nextInt();
		for (int i=0; i<temp; i++)
			operators.add('*');
		temp = s.nextInt();
		for (int i=0; i<temp; i++)
			operators.add('/');
		s.close();
		
		visit = new boolean[operators.size()];
		
		dfs(0, operands[0]);
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void dfs(int c, int n) {
		if (c == operators.size()) {
			if (max < n) max = n;
			if (min > n) min = n;
			return;
		}
		
		int temp = n;
		for (int i=0; i<operators.size(); i++) {
			if (!visit[i]) {
				n = calc(n, operators.get(i), operands[c+1]);
				visit[i] = true;
				dfs(c+1, n);
				visit[i] = false;
				n = temp;
			}
		}
	}
	
	public static int calc(int n1, char op, int n2) {
		int result = 0;
		
		switch (op) {
		case '+': result = n1+n2; 
			break;
		case '-': result = n1-n2;
			break;
		case '*': result = n1*n2;
			break;
		case '/': result = n1/n2;
			break;
		}
		
		return result;
	}
}