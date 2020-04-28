// 문제번호		2523
// 문제이름		별 찍기 - 13
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
		for (j=0; j<=i; j++)
			printf("*");
		printf("\n");
	}

	for (i = n-2; i >= 0; i--)
	{
		for (j = i; j >= 0; j--)
			printf("*");
		printf("\n");
	}

	return 0;
}