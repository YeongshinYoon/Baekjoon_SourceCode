// 문제번호		10871
// 문제이름		X보다 작은 수
// 문제분류		문제/단계별로 풀어보기/3_for문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int n = 0, x = 0, i = 0;
	int* arr = NULL;

	scanf("%d %d", &n, &x);
	arr = (int*)malloc(sizeof(int) * n);

	if (arr != NULL)
	{
		for (i = 0; i < n; i++)
		{
			scanf("%d", &arr[i]);
			if (arr[i] < x) printf("%d ", arr[i]);
		}
		printf("\n");
	}

	return 0;
}