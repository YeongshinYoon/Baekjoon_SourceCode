// 문제번호		1546
// 문제이름		평균
// 문제분류		문제/단계별로 풀어보기/6_1차원 배열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int n = 0, i = 0, sum = 0, M = 0;
	double* arr = NULL;
	double avg = 0;

	scanf("%d", &n);
	arr = (double*)malloc(sizeof(double) * n);
	if (arr != NULL)
	{
		for (i = 0; i < n; i++)
		{
			scanf("%lf", &arr[i]);
			if (M < arr[i]) M = arr[i];
		}
		for (i = 0; i < n; i++)
		{
			arr[i] = arr[i] / M * 100;
			avg += arr[i];
		}
		avg /= n;

		printf("%lf\n", avg);
	}

	return 0;
}