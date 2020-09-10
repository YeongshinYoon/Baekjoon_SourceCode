//������ȣ		9375
//�����̸�		�мǿ� ���غ�
//�����з�		����/�ܰ躰�� Ǯ���/19_���� 3
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.util.Scanner;
import java.util.Hashtable;

public class Math3_9_9375 {
	public static void main(String[] args) {
		int t, n;
		String[][] clothes;
		Hashtable<String, Integer> table = new Hashtable<>();
		Scanner s = new Scanner(System.in);
		
		t = s.nextInt();
		
		for (int i=0; i<t; i++) {
			n = s.nextInt();
			clothes = new String[n][2];
			table.clear();
			for (int j=0; j<n; j++) {
				clothes[j][0] = s.next();
				clothes[j][1] = s.next();
				if (table.containsKey(clothes[j][1])) {
					table.replace(clothes[j][1], table.get(clothes[j][1])+1);
				}
				else {
					table.put(clothes[j][1], 1);
				}
			}
			
			int sum = 1;
			for (String str : table.keySet())
				sum *= (table.get(str)+1);
			sum--;
			System.out.println(sum);
		}
		s.close();
	}
	
}
