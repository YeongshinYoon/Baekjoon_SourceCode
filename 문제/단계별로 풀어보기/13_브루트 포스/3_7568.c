// ������ȣ		7568
// �����̸�		��ġ
// �����з�		����/�ܰ躰�� Ǯ���/13_���Ʈ ����
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int n, i, j;
	int** arr;
	int* rank;

	scanf("%d", &n);
	arr = (int**)malloc(sizeof(int*) * n);
	rank = (int*)malloc(sizeof(int) * n);
	if (arr == NULL || rank == NULL) exit(1);

	for (i = 0; i < n; i++)
	{
		rank[i] = 1;
		arr[i] = (int*)malloc(sizeof(int) * 2);
		if (arr[i] == NULL) exit(1);
		scanf("%d %d", &arr[i][0], &arr[i][1]);
	}

	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++) {
			if (i == j) continue;
			if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank[i]++;
		}
	}

	for (i = 0; i < n; i++) printf("%d ", rank[i]);
	return 0;
}