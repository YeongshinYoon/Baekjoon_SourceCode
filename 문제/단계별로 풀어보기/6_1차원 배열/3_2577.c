// 문제번호		2577
// 문제이름		숫자의 개수
// 문제분류		문제/단계별로 풀어보기/6_1차원 배열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
	int a = 0, b = 0, c = 0, d = 0;
	int count = 0, temp = 0, i = 0, j = 0;
	int* arr = (int*)malloc(sizeof(int) * 10);
	int* arr_num = NULL;

	if (arr != NULL)
	{
		for (i = 0; i < 10; i++)
			arr[i] = 0;

		scanf("%d %d %d", &a, &b, &c);

		d = a * b * c;
		temp = d;
		while (1)
		{
			temp = temp / 10;
			count++;
			if (temp == 0)
				break;
		}

		arr_num = (int*)malloc(sizeof(int) * count);
		if (arr_num != NULL)
		{
			temp = d;
			for (i = count - 1; i >= 0; i--)
			{
				arr_num[count - i - 1] = temp / (int)pow(10, i);
				temp = temp - (arr_num[count - i - 1] * (int)pow(10, i));
				arr[arr_num[count - i - 1]]++;
				
			}
		}

		for (i = 0; i < 10; i++)
			printf("%d\n", arr[i]);
	}

	return 0;
}
