// ������ȣ		2447
// �����̸�		�� ��� - 10
// �����з�		����/�ܰ躰�� Ǯ���/11_���
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

void add_star(int, int, int);

char** arr;

int main(void)
{
	int n, i, j;

	scanf("%d", &n);
	arr = (char**)malloc(sizeof(char*) * n);
	if (arr == NULL) exit(1);

	for (i = 0; i < n; i++)
	{
		arr[i] = (char*)malloc(sizeof(char) * n);
		if (arr[i] == NULL) exit(1);

		for (j = 0; j < n; j++) arr[i][j] = ' ';
	}
	
	add_star(n, 0, 0);
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			printf("%c", arr[i][j]);
		}
		printf("\n");
	}

	return 0;
}

void add_star(int n, int x, int y)
{
	int i, j;

	if (n <= 1) arr[x][y] = '*';
	else
	{
		for (i = x; i < x + n; i += n/3)
		{
			for (j = y; j < y + n; j += n/3)
			{
				if (i == x + n / 3 && j == y + n / 3) continue;
				add_star(n / 3, i, j);
			}
		}
	}
}