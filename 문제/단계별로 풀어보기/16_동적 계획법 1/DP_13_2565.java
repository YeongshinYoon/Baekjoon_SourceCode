//문제번호		2565
//문제이름		전깃줄
//문제분류		문제/단계별로 풀어보기/16_동적 계획법 1
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//LIS 해법
public class DP_13_2565 {
	public static void main(String[] args) {
		int n;
		int line[][];
		int count[];
		int min_count = Integer.MIN_VALUE;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		line = new int[n+1][3];
		count = new int[n+1];
		for (int i=1; i<=n; i++) {
			line[i][1] = s.nextInt();
			line[i][2] = s.nextInt();
		}
		s.close();
		
		Arrays.sort(line, 1, n+1, Comparator.comparingInt(o1 -> o1[1]));
		
		count[1] = 1;
		for (int i=2; i<=n; i++) {
			count[i] = 1;
			for (int j=1; j<i; j++) {
				if (!isCross(line[i][1], line[i][2], line[j][1], line[j][2]) && count[i] < count[j]+1) {
					count[i]++;
				}
			}
			if (min_count < count[i]) min_count = count[i];
		}
		
		min_count = n - min_count;
		System.out.println(min_count);
	}
	
	public static boolean isCross(int n1, int n2, int n3, int n4) {
		if ((n1 < n3 && n2 < n4) || (n1 > n3 && n2 > n4)) {
			return false;
		}
		
		return true;
	}
}

//Greedy 해법
/*public class DP_13_2565 {
	public static void main(String[] args) {
		int n;
		int arr[][];
		int cross_count[];
		int max_cross_count;
		int max_index;
		
		ArrayList<Integer> disconnected = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		arr = new int[n+1][2];
		cross_count = new int[n+1];
		for (int i=1; i<=n; i++) {
			arr[i][0] = s.nextInt();
			arr[i][1] = s.nextInt();
		}
		s.close();
		
		for (int k=1; k<=n; k++) {
			max_index = -1;
			max_cross_count = 0;
			for (int i=1; i<=n; i++) {
				cross_count[i] = 0;
				if (isDisconnected(disconnected, i)) continue;
				for (int j=1; j<=n; j++) {
					if (i == j) continue;
					if (isDisconnected(disconnected, j)) continue;
					if (isCross(arr[i][0], arr[i][1], arr[j][0], arr[j][1])) {
						cross_count[i]++;
					}
				}
				if (max_cross_count < cross_count[i]) {
					max_cross_count = cross_count[i];
					max_index = i;
				}
			}
			if (max_index != -1)
				disconnected.add(max_index);
			else break;
		}
		System.out.println(disconnected.size());
	}
	
	public static boolean isCross(int n1, int n2, int n3, int n4) {
		//System.out.println(n1 + " " + n2 + " / " + n3 + " " + n4);
		if ((n1 < n3 && n2 < n4) || (n1 > n3 && n2 > n4)) {
			return false;
		}
		
		return true;
	}
	
	public static boolean isDisconnected(ArrayList<Integer> list, int n) {
		for (int i : list) {
			if (i == n) return true;
		}
		
		return false;
	}
}*/