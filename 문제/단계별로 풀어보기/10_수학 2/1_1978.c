// ������ȣ		1978
// �����̸�		�Ҽ� ã��
// �����з�		����/�ܰ躰�� Ǯ���/10_����2
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int n, i, j, max;
	int* arr;
	int* prime_num_arr;
	int prime_count;
	int result;

	scanf("%d", &n);
	arr = (int*)malloc(sizeof(int) * n);
	if (arr == NULL) exit(1);
	max = 0;
	for (i = 0; i < n; i++)
	{
		scanf("%d", &arr[i]);
		if (max < arr[i]) max = arr[i];
	}
	prime_count = 1;
	prime_num_arr = (int*)malloc(sizeof(int) * prime_count);
	if (prime_num_arr == NULL) exit(1);
	prime_num_arr[0] = 2;
	for (i = 3; i <= max; i++)
	{
		for (j = 0; j < prime_count; j++)
		{
			if (i % prime_num_arr[j] == 0)
				break;
		}
		if (j == prime_count)
		{
			prime_count++;
			prime_num_arr = (int*)realloc(prime_num_arr, sizeof(int) * (prime_count + 1));
			if (prime_num_arr == NULL) exit(1);
			prime_num_arr[prime_count-1] = i;
		}
	}

	result = 0;
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < prime_count; j++)
		{
			if (arr[i] == prime_num_arr[j])
			{
				result++;
				break;
			}
		}
	}

	printf("%d\n", result);
	return 0;
}