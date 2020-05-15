// 문제번호		2798
// 문제이름		블랙잭
// 문제분류		문제/단계별로 풀어보기/13_브루트 포스
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int maxNoMoreThanM(int, int, int);

int main(void)
{
	int n, m, i, j, k, max, temp;
	int* arr;

	scanf("%d %d", &n, &m);

	arr = (int*)malloc(sizeof(int) * n);
	if (arr == NULL) exit(1);
	for (i = 0; i < n; i++) scanf("%d", &arr[i]);

	max = -1;
	for (i = 0; i < n - 2; i++)
	{
		for (j = i + 1; j < n - 1; j++)
		{
			for (k = j + 1; k < n; k++)
			{
				temp = maxNoMoreThanM(max, arr[i] + arr[j] + arr[k], m);
				if (temp != -1) max = temp;
			}
		}
	}

	printf("%d\n", max);

	return 0;
}

int maxNoMoreThanM(int a, int b, int m)
{
	if (a > b && a <= m) return a;
	else if (a < b && b <= m) return b;
	else return -1;
}