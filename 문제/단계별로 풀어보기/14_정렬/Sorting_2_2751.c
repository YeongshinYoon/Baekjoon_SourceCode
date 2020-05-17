// 문제번호		2751
// 문제이름		수 정렬하기 2
// 문제분류		문제/단계별로 풀어보기/14_정렬
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void quickSort(int*, int, int);
int partition(int*, int, int);

int main(void)
{
	int n, i;
	int* arr;

	srand((unsigned int)time(NULL));

	scanf("%d", &n);
	arr = (int*)malloc(sizeof(int) * n);
	if (arr == NULL) exit(1);

	for (i = 0; i < n; i++) scanf("%d", &arr[i]);
	
	quickSort(arr, 0, n - 1);
	for (i = 0; i < n; i++) printf("%d ", arr[i]);
	printf("\n");

	return 0;
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

int partition(int* arr, int start, int end)
{
	int pivotpoint, pivot, temp, i, j;

	//랜덤 pivotpoint
	pivotpoint = (rand() % (end - start + 1)) + start;
	//start와 swap
	temp = arr[pivotpoint];
	arr[pivotpoint] = arr[start];
	arr[start] = temp;
	//pivot 지정
	pivot = arr[start];

	j = start;

	for (i = start + 1; i <= end; i++)
	{
		if (arr[i] < pivot)
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