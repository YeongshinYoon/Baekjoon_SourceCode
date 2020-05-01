// 문제번호		10818
// 문제이름		최소, 최대
// 문제분류		문제/단계별로 풀어보기/6_1차원 배열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int n = 0, i = 0;
	int* arr = NULL;
	int big = 0, small = 0;

	scanf("%d", &n);
	arr = (int*)malloc(sizeof(int) * n);
	for (i = 0; i < n; i++)
	{
		scanf("%d", &arr[i]);
		if (i == 0)
		{
			big = arr[0];
			small = arr[0];
		}
		else
		{
			if (big < arr[i]) big = arr[i];
			if (small > arr[i]) small = arr[i];
		}
	}

	printf("%d %d\n", small, big);
	

	return 0;
}