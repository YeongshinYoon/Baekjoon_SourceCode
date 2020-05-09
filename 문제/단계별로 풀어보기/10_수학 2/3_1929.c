// 문제번호		1929
// 문제이름		소수 구하기
// 문제분류		문제/단계별로 풀어보기/10_수학2
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int i, j, m, n;
	int* arr;

	scanf("%d %d", &m, &n);
	arr = (int*)malloc(sizeof(int) * (n + 1));
	arr[0] = 0;
	arr[1] = 0;
	for (i = 2; i <= n; i++)
		arr[i] = i;

	for (i = 2; i <= n; i++)
	{
		if (arr[i] == 0) continue;
		for (j = 2 * i; j <= n; j+=i)
			arr[j] = 0;
	}

	for (i = m; i <= n; i++)
		if (arr[i] != 0) printf("%d\n", arr[i]);

	return 0;
}