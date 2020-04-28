// 문제번호		2446
// 문제이름		별 찍기 - 9
// 문제분류		문제/단계별로 풀어보기/5_실습1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int n = 0, i = 0, j = 0;

	scanf("%d", &n);

	for (i = 0; i < n; i++)
	{
		for (j = 0; j < i; j++)
			printf(" ");
		for (j = i; j < 2 * n - 1 - i; j++)
			printf("*");
		printf("\n");
	}

	for (i = 1; i < n; i++)
	{
		for (j = n - 1; j > i; j--)
			printf(" ");
		for (j = 0; j < 2 * i + 1; j++)
			printf("*");
		printf("\n");
	}

	return 0;
}