//문제번호		2580
//문제이름		스도쿠
//문제분류		문제/단계별로 풀어보기/15_백트래킹
//문제출처		acmicpc.net
//코드작성자	YOON Yeongshin

import java.util.ArrayList;
import java.util.Scanner;

public class BackTracking_6_2580 {
	static int board[][] = new int[10][10];
	static ArrayList<String> blanks = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	static boolean find;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				board[i][j] = s.nextInt();
			}
		}
		s.close();
		find = false;
		
		findBlank();
		dfs(0);
		
		System.out.print(sb);
	}
	
	public static void dfs(int c) {
		if (find) return;
		
		if (c == blanks.size()) {
			for (int i=1; i<=9; i++) {
				for (int j=1; j<=9; j++) {
					sb.append(board[i][j] + " ");
				}
				sb.append("\n");
			}
			find = true;
			return;
		}
		
		int i1 = blanks.get(c).charAt(0)-48;
		int i2 = blanks.get(c).charAt(1)-48;
		
		for (int k=1; k<=9; k++) {
			if (isValid(k, i1, i2)) {
				board[i1][i2] = k;
				dfs(c+1);
				board[i1][i2] = 0;
			}
		}
	}
	
	public static boolean isValid(int n, int r, int c) {
		for (int i=1; i<=9; i++) {
			if (i == c) continue;
			if (board[r][i] == n) return false;
		}
		for (int i=1; i<=9; i++) {
			if (i == r) continue;
			if (board[i][c] == n) return false;
		}
		int temp1 = r/3;
		temp1 *= 3;
		temp1 += r%3;
		int temp2 = c/3;
		temp2 *= 3;
		temp2 += c%3;
		if (temp1 >= 1 && temp1 <= 3) {
			if (temp2 >= 1 && temp2 <= 3) {
				temp1 = 1;
				temp2 = 1;
			}
			else if (temp2 >= 4 && temp2 <= 6) {
				temp1 = 1;
				temp2 = 4;
			}
			else if (temp2 >= 7 && temp2 <= 9) {
				temp1 = 1;
				temp2 = 7;
			}
		}
		else if (temp1 >= 4 && temp1 <= 6) {
			if (temp2 >= 1 && temp2 <= 3) {
				temp1 = 4;
				temp2 = 1;
			}
			else if (temp2 >= 4 && temp2 <= 6) {
				temp1 = 4;
				temp2 = 4;
			}
			else if (temp2 >= 7 && temp2 <= 9) {
				temp1 = 4;
				temp2 = 7;
			}
		}
		else if (temp1 >= 7 && temp1 <= 9) {
			if (temp2 >= 1 && temp2 <= 3) {
				temp1 = 7;
				temp2 = 1;
			}
			else if (temp2 >= 4 && temp2 <= 6) {
				temp1 = 7;
				temp2 = 4;
			}
			else if (temp2 >= 7 && temp2 <= 9) {
				temp1 = 7;
				temp2 = 7;
			}
		}
		
		for (int i = temp1; i<temp1+3; i++) {
			for (int j = temp2; j<temp2+3; j++) {
				if (i == r && j == c) continue;
				if (board[i][j] == n) return false;
			}
		}
		
		return true;
	}
	
	public static void findBlank() {
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if (board[i][j] == 0)
					blanks.add(i + "" + j);
			}
		}
	}
}