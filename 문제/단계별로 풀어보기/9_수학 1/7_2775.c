// ������ȣ		2775
// �����̸�		�γ�ȸ���� ���׾�
// �����з�		����/�ܰ躰�� Ǯ���/9_����1
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int arr_sum(int*, int);

int main()
{
	int t, k, n, i, j, l;
	int* arr1;
	int* arr2;

	scanf("%d", &t);

	for (i = 0; i < t; i++)
	{
		scanf("%d %d", &k, &n);
		arr1 = (int*)malloc(sizeof(int) * n);
		arr2 = (int*)malloc(sizeof(int) * n);
		if (arr1 == NULL || arr2 == NULL) exit(1);
		for (j = 0; j < n; j++)
			arr1[j] = j + 1;
		for (j = 1; j <= k; j++)
		{
			for (l = 0; l < n; l++)
			{
				if (j % 2 == 0) arr1[l] = arr_sum(arr2, l + 1);
				else arr2[l] = arr_sum(arr1, l + 1);
			}
		}

		if (k % 2 == 0) printf("%d\n", arr1[n - 1]);
		else printf("%d\n", arr2[n - 1]);
	}

	return 0;
}

int arr_sum(int* arr, int n)
{
	int i, sum;

	sum = 0;
	for (i = 0; i < n; i++)
		sum += arr[i];

	return sum;
}