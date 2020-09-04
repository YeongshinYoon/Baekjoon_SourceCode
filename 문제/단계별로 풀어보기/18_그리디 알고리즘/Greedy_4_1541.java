//������ȣ		1541
//�����̸�		�Ҿ���� ��ȣ
//�����з�		����/�ܰ躰�� Ǯ���/18_�׸��� �˰���
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;
import java.util.StringTokenizer;

public class Greedy_4_1541 {
	public static void main(String[] args) {
		String equation;
		int operands[];
		char operators[];
		int index;
		Scanner s = new Scanner(System.in);
		
		equation = s.next();
		s.close();
		
		StringTokenizer st = new StringTokenizer(equation, "+-");
		operands = new int[st.countTokens()];
		index = 0;
		while (st.hasMoreTokens()) 
			operands[index++] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(equation, "0123456789");
		operators = new char[operands.length-1];
		index = 0;
		while (st.hasMoreTokens()) 
			operators[index++] = st.nextToken().charAt(0);
		
		index = 0;
		for (int i=0; i<operators.length; i++)
		{
			if (operators[i] == '+')
			{
				index++;
				operands[i] += operands[i+1];
				for (int j=i; j<operators.length-1; j++)
					operators[j] = operators[j+1];
				for (int j=i+1; j<operands.length-1; j++)
					operands[j] = operands[j+1];
				i--;
				
				operators[operators.length-index] = ' ';
				operands[operands.length-index] = 0;
			}
			else break;
		}
		
		int i;
		for (i=0; i<operators.length; i++)
		{
			if (operators[i] == ' ') break;
			operands[i+1] = operands[i] - operands[i+1];
		}
		
		System.out.println(operands[i]);
	}
}
