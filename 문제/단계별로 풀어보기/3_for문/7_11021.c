// 문제번호		11021
// 문제이름		A+B - 7
// 문제분류		문제/단계별로 풀어보기/3_for문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int n = 0, i = 0;
	int** arr = NULL;

	scanf("%d", &n);
	arr = (int**)malloc(sizeof(int*) * n);

	for (i = 0; i < n; i++)
	{
		arr[i] = (int*)malloc(sizeof(int) * 2);
		scanf("%d %d", &arr[i][0], &arr[i][1]);
	}

	for (i = 0; i < n; i++)
		printf("Case #%d: %d\n", i + 1, arr[i][0] + arr[i][1]);

	return 0;
}