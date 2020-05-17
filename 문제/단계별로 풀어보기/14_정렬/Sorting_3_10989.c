// 문제번호		10989
// 문제이름		수 정렬하기 3
// 문제분류		문제/단계별로 풀어보기/14_정렬
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main(void)
{
	int n, i, j;
	int arr[10000];

	for (i = 0; i < 10000; i++) arr[i] = 0;

	scanf("%d", &n);

	for (i = 0; i < n; i++)
	{
		scanf("%d", &j);
		arr[j - 1]++;
	}

	for (i = 0; i < 10000; i++)
	{
		for (j = 0; j < arr[i]; j++)
		{
			printf("%d\n", i + 1);
		}
	}

	return 0;
}