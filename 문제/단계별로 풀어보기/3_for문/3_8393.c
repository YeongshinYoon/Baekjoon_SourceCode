// 문제번호		8393
// 문제이름		합
// 문제분류		문제/단계별로 풀어보기/3_for문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int i = 0, n = 0;
	int sum = 0;

	scanf("%d", &n);

	for (i = 1; i <= n; i++)
	{
		sum += i;
	}

	printf("%d\n", sum);

	return 0;
}