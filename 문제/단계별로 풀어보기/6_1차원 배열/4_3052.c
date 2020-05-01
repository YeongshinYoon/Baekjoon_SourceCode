// 문제번호		3052
// 문제이름		나머지
// 문제분류		문제/단계별로 풀어보기/6_1차원 배열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int i = 0, j = 0;
	int arr[10] = { 0, };
	int count = 0;

	for (i = 0; i < 10; i++)
	{
		scanf("%d", &arr[i]);
		arr[i] = arr[i] % 42;
	}

	for (i = 0; i < 10; i++)
	{
		for (j = 0; j < 10; j++)
		{
			if (i == j) continue;
			if (arr[i] == -1) continue;
			if (arr[i] == arr[j])
			{
				arr[j] = -1;
				count++;
			}
		}
	}

	printf("%d\n", 10 - count);

	return 0;
}