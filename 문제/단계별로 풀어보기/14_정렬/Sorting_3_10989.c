// ������ȣ		10989
// �����̸�		�� �����ϱ� 3
// �����з�		����/�ܰ躰�� Ǯ���/14_����
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>

int main(void)
{
	int n, i, j;
	int arr[10000];

	for (i = 0; i < 10000; i++) arr[i] = 0;

	scanf("%d", &n);

	for (i = 0; i < n; i++)
	{
		scanf("%d", &j);
		arr[j - 1]++;
	}

	for (i = 0; i < 10000; i++)
	{
		for (j = 0; j < arr[i]; j++)
		{
			printf("%d\n", i + 1);
		}
	}

	return 0;
}