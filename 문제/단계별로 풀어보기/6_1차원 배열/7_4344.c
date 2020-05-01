// 문제번호		4344
// 문제이름		평균은 넘겠지
// 문제분류		문제/단계별로 풀어보기/6_1차원 배열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main() {
	int c = 0, n = 0, i = 0, j = 0;
	int** arr = NULL;
	int count = 0;
	double avg = 0;
	double* avg_arr = NULL;

	scanf("%d", &c);
	arr = (int**)malloc(sizeof(int*) * c);
	avg_arr = (double*)malloc(sizeof(double) * c);
	if (arr != NULL && avg_arr != NULL)
	{
		for (i = 0; i < c; i++)
		{
			avg = 0;
			count = 0;
			scanf("%d", &n);
			arr[i] = (int*)malloc(sizeof(int) * (n + 1));
			for (j = 0; j < n; j++)
			{
				scanf("%d", &arr[i][j]);
				avg += arr[i][j];
			}
			avg /= n;
			for (j = 0; j < n; j++)
			{
				if (arr[i][j] > avg)
					count++;
			}
			avg = count * 100.0 / n;
			avg_arr[i] = avg;
		}

		for (i = 0; i < c; i++)
			printf("%.3lf%%\n", avg_arr[i]);
	}

	return 0;
}