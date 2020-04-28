// 문제번호		10996
// 문제이름		별 찍기 - 21
// 문제분류		문제/단계별로 풀어보기/5_실습1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int i = 0, j = 0, n = 0;

	scanf("%d", &n);

	for (i = 0; i < n; i++)
	{
		if (n == 0) printf("*");
		else
		{
			for (j = 0; j < n; j++)
			{
				if (j % 2 == 0) printf("*");
				else printf(" ");
			}
			printf("\n");
			for (j = 0; j < n; j++)
			{
				if (j % 2 == 1) printf("*");
				else printf(" ");
			}
		}
		printf("\n");
	}

	return 0;
}