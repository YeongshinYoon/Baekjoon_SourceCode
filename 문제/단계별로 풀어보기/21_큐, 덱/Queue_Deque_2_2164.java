//문제번호		2164
//문제이름		카드2
//문제분류		문제/단계별로 풀어보기/21_큐, 덱
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

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
