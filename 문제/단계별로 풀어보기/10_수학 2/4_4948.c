// ������ȣ		4948
// �����̸�		����Ʈ�� ����
// �����з�		����/�ܰ躰�� Ǯ���/10_����2
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int i, j, n, count;
	int* arr;

	while (1)
	{
		scanf("%d", &n);
		if (n == 0) break;
		arr = (int*)malloc(sizeof(int) * (2*n + 1));
		arr[0] = 0;
		arr[1] = 0;
		for (i = 2; i <= 2*n; i++)
			arr[i] = i;

		for (i = 2; i <= 2*n; i++)
		{
			if (arr[i] == 0) continue;
			for (j = 2 * i; j <= 2*n; j += i)
				arr[j] = 0;
		}

		count = 0;
		for (i = n+1; i <= 2 * n; i++)
			if (arr[i] != 0) count++;

		printf("%d\n", count);
	}
	return 0;
}