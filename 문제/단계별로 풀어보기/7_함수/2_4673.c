// 문제번호		4673
// 문제이름		셀프 넘버
// 문제분류		문제/단계별로 풀어보기/7_함수
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int d(int);

int main()
{
	int i = 0, j = 0, temp = 0, count = 0;
	int* arr = NULL;

	for (i = 1; i <= 10000; i++)
	{
		temp = d(i);
		count++;
		arr = (int*)realloc(arr, sizeof(int) * count);
		if (arr != NULL)
			arr[count-1] = temp;
	}

	for (i = 1; i <= 10000; i++)
	{
		for (j = 0; j < count; j++)
		{
			if (i == arr[j]) break;
		}
		if (j == count) printf("%d\n", i);
	}
	return 0;
}

int d(int n)
{
	int count = 0, temp = 0, sum = 0, digit = 0;
	int i = 0;

	temp = n;
	while (1)
	{
		temp /= 10;
		count++;
		if (temp == 0) break;
	}

	sum = n;
	temp = n;
	for (i = count - 1; i >= 0; i--)
	{
		digit = temp / (int)pow(10, i);
		temp = temp - (digit * (int)pow(10, i));
		sum += digit;
	}

	return sum;
}