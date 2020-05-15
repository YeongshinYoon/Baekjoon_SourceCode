// 문제번호		1018
// 문제이름		체스판 다시 칠하기
// 문제분류		문제/단계별로 풀어보기/13_브루트 포스
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

//#define min(a, b) (((a) < (b)) ? (a) : (b))

int checkBoard(char**, int, int, char);

int main(void)
{
	int m, n, i, j, m2, n2;
	char** board;
	int min, temp;

	scanf("%d %d\n", &m, &n);
	
	m2 = m - 8;
	n2 = n - 8;
	board = (char**)malloc(sizeof(char*) * m);
	if (board == NULL) exit(1);

	for (i = 0; i < m; i++)
	{
		board[i] = (char*)malloc(sizeof(char) * n);
		if (board[i] == NULL) exit(1);
		for (j = 0; j < n; j++) scanf("%c", &board[i][j]);
		if (i == m - 1) continue;
		scanf("\n");
	}

	min = -1;
	for (i = 0; i <= m2; i++) {
		for (j = 0; j <= n2; j++) {
			temp = min(checkBoard(board, i, j, 'B'), checkBoard(board, i, j, 'W'));
			if (min == -1) min = temp;
			else {
				if (min > temp) min = temp;
			}
		}
	}

	printf("%d\n", min);

	return 0;
}

int checkBoard(char** board, int m, int n, char start)
{
	int i, j, count;

	count = 0;
	for (i = m; i < m + 8; i++) {
		for (j = n; j < n + 8; j++) {
			if (start == 'B') {
				if ((i - m) % 2 == 0) {
					if ((j - n) % 2 == 0) {
						if (board[i][j] != 'B') count++;
					}
					else {
						if (board[i][j] != 'W') count++;
					}
				}
				else {
					if ((j - n) % 2 == 0) {
						if (board[i][j] != 'W') count++;
					}
					else {
						if (board[i][j] != 'B') count++;
					}
				}
			}
			else {
				if ((i - m) % 2 == 0) {
					if ((j - n) % 2 == 0) {
						if (board[i][j] != 'W')	count++;
					}
					else {
						if (board[i][j] != 'B') count++;
					}
				}
				else {
					if ((j - n) % 2 == 0) {
						if (board[i][j] != 'B') count++;
					}
					else {
						if (board[i][j] != 'W') count++;
					}
				}
			}
		}
	}

	return count;
}