// 문제번호		9020
// 문제이름		골드바흐의 추측
// 문제분류		문제/단계별로 풀어보기/10_수학2
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int t, n, i, j, k, p1, p2;
	int* arr;

	scanf("%d", &t);
	for (i = 0; i < t; i++)
	{
		scanf("%d", &n);
		arr = (int*)malloc(sizeof(int) * n);
		if (arr == NULL) exit(1);
		arr[0] = 0;
		arr[1] = 0;
		for (j = 2; j < n; j++)
			arr[j] = j;

		for (j = 2; j < n; j++)
		{
			if (arr[j] == 0) continue;
			for (k = 2 * j; k < n; k += j)
				arr[k] = 0;
		}

		p1 = p2 = 0;
		for (j = 2; j <= n/2; j++)
		{
			if (arr[j] != 0)
			{
				if (arr[n - j] != 0)
				{
					if (((p1 == 0 && p2 == 0) || ((p2 - p1) > (n - (2 * j)))) && (n >= 2*j))
					{
						p1 = j;
						p2 = n - j;
					}
				}
			}
		}

		printf("%d %d\n", p1, p2);
	}

	return 0;
}