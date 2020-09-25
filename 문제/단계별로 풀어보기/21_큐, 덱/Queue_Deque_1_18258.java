//문제번호		18258
//문제이름		큐 2
//문제분류		문제/단계별로 풀어보기/21_큐, 덱
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Deque_1_18258 {
	public static void main(String[] args) {
		int n, size, front, back;
		Queue<Integer> q = new LinkedList<>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			n = Integer.parseInt(br.readLine());
			size = 0;
			front = -1;
			back = -1;
			for (int i=0; i<n; i++) {
				String[] splited = br.readLine().split(" ");
				switch (splited[0]) {
				case "push":
					int element = Integer.parseInt(splited[1]);
					if (size == 0) {
						front = element;
					}
					back = element;
					q.add(element);
					size++;
					break;
				case "pop":
					if (size == 0) bw.append("-1\n");
					else {
						bw.append(q.poll() + "\n");
						size--;
						if (size != 0) {
							front = q.peek();
						}
					}
					break;
				case "size":
					bw.append(size + "\n");
					break;
				case "empty":
					if (size == 0) bw.append("1\n");
					else bw.append("0\n");
					break;
				case "front":
					if (size == 0) bw.append("-1\n");
					else bw.append(front + "\n");
					break;
				case "back":
					if (q.isEmpty()) bw.append("-1\n");
					else bw.append(back + "\n");
					break;
				}
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
