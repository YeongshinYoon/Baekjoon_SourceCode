// ������ȣ		2581
// �����̸�		�Ҽ�
// �����з�		����/�ܰ躰�� Ǯ���/10_����2
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int i, j, m, n, prime_count, sum, min;
	int* prime_num_arr;

	scanf("%d %d", &m, &n);
	prime_count = 1;
	prime_num_arr = (int*)malloc(sizeof(int) * prime_count);
	if (prime_num_arr == NULL) exit(1);
	prime_num_arr[0] = 2;

	for (i = 3; i <= n; i++)
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
			prime_num_arr[prime_count - 1] = i;
		}
	}

	sum = 0;
	min = 0;
	for (i = m; i <= n; i++)
	{
		for (j = 0; j < prime_count; j++)
		{
			if (i == prime_num_arr[j])
			{
				if (min == 0)
					min = i;
				sum += i;
				break;
			}
		}
	}

	if (sum == 0) printf("-1\n");
	else
	{
		printf("%d\n", sum);
		printf("%d\n", min);
	}
	return 0;
}