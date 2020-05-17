// ������ȣ		2750
// �����̸�		�� �����ϱ�
// �����з�		����/�ܰ躰�� Ǯ���/14_����
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

void insertionSort(int*, int);

int main(void)
{
	int n, i;
	int* arr;

	scanf("%d", &n);
	arr = (int*)malloc(sizeof(int) * n);
	if (arr == NULL) exit(1);

	for (i = 0; i < n-1; i++) scanf("%d\n", &arr[i]);
	scanf("%d", &arr[n - 1]);
	insertionSort(arr, n);

	return 0;
}

void insertionSort(int* arr, int n)
{
	int i, j, key;

	for (i = 1; i < n; i++)
	{
		key = arr[i];
		for (j = i - 1; j >= 0; j--)
		{
			if (arr[j] > key) arr[j+1] = arr[j];
			else break;
		}
		arr[j+1] = key;
	}

	for (i = 0; i < n; i++) printf("%d\n", arr[i]);
}