// 문제번호		1427
// 문제이름		소트인사이드
// 문제분류		문제/단계별로 풀어보기/14_정렬
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

int calcDigits(int);
int* numToArr(int, int);
int partition(int*, int, int);
void quickSort(int*, int, int);

int main(void)
{
	int n, i, digits;
	int* arr;

	srand((unsigned int)time(NULL));
	scanf("%d", &n);
	
	digits = calcDigits(n);
	arr = numToArr(n, digits);

	quickSort(arr, 0, digits - 1);
	for (i = digits - 1; i >= 0; i--)
		printf("%d", arr[i]);
	printf("\n");

	return 0;
}

int calcDigits(int n)
{
	int count = 0;

	while (1)
	{
		n /= 10;
		count++;
		if (n == 0) break;
	}

	return count;
}

int* numToArr(int n, int size)
{
	int i, temp;
	int* arr = (int*)malloc(sizeof(int) * size);
	if (arr == NULL) exit(1);

	for (i = 0; i < size; i++)
	{
		temp = n / (int)pow(10, size - i - 1);
		arr[i] = temp;
		n -= (temp * (int)pow(10, size - i - 1));
	}

	return arr;
}

int partition(int* arr, int start, int end)
{
	int pivotpoint, temp, i, j, pivot;

	pivotpoint = (rand() % (end - start + 1)) + start;
	
	temp = arr[pivotpoint];
	arr[pivotpoint] = arr[start];
	arr[start] = temp;
	
	j = start;
	pivot = arr[start];

	for (i = start + 1; i <= end; i++)
	{
		if (pivot > arr[i])
		{
			j++;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	pivotpoint = j;
	temp = arr[pivotpoint];
	arr[pivotpoint] = arr[start];
	arr[start] = temp;

	return pivotpoint;
}

void quickSort(int* arr, int start, int end)
{
	int pivot;

	if (start < end)
	{
		pivot = partition(arr, start, end);
		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot + 1, end);
	}
}