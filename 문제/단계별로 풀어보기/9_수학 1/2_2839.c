// 문제번호		2839
// 문제이름		설탕 배달
// 문제분류		문제/단계별로 풀어보기/9_수학 1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int min_modified(int, int);

int main()
{
	int n, i;
	int* c;

	scanf("%d", &n);
	c = (int*)malloc(sizeof(int) * (n + 1));

	c[0] = -1;
	c[1] = -1;
	c[2] = -1;
	c[3] = 1;
	c[4] = -1;
	c[5] = 1;
	i = 6;
	while (i <= n)
	{
		c[i] = min_modified(c[i - 3], c[i - 5]);
		if (c[i] != -1) c[i]++;
		i++;
	}

	printf("%d\n", c[n]);
	
	return 0;
}

int min_modified(int a, int b)
{
	if (a < b)
	{
		if (a == -1)
			return b;
		return a;
	}
	else
	{
		if (b == -1)
			return a;
		return b;
	}
}