//������ȣ		2164
//�����̸�		ī��2
//�����з�		����/�ܰ躰�� Ǯ���/21_ť, ��
//������ó		acmicpc.net
//�ڵ��ۼ���	YOON Yeongshin

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Deque_2_2164 {
	public static void main(String[] args) {
		int n, size, front, back;
		Queue<Integer> q = new LinkedList<>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			n = Integer.parseInt(br.readLine());
			size = n;
			front = 1;
			back = n;
			for (int i=1; i<=n; i++)
				q.offer(i);
			while (true) {
				if (size == 1) break;
				q.poll();
				size--;
				back = q.poll();
				q.offer(back);
				front = q.peek();
			}
			bw.append(Integer.toString(front));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
