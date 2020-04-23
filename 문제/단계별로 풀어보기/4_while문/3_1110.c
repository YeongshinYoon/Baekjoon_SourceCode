// 문제번호		1110
// 문제이름		더하기 사이클
// 문제분류		문제/단계별로 풀어보기/4_while문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int n = 0, cycle = 0;
	int a = 0, b = 0, c = 0;

	scanf("%d", &n);

	c = n;
	while (1)
	{
		if (c < 10)
		{
			a = 0;
			b = c;
		}
		else
		{
			a = c / 10;
			b = c - (a * 10);
		}
		
		if (a + b >= 10)
			c = (b * 10) + (a + b - 10);
		else c = (b * 10) + (a + b);
		cycle++;

		if (c == n)
			break;
	}

	printf("%d\n", cycle);

	return 0;
}