// ������ȣ		11729
// �����̸�		�ϳ��� ž �̵� ����
// �����з�		����/�ܰ躰�� Ǯ���/11_���
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>

void hanoi_tower(int, int, int, int, int);
int count;

int main(void)
{
	int n;

	scanf("%d", &n);

	hanoi_tower(1, 2, 3, n, 0);
	printf("%d\n", count);
	hanoi_tower(1, 2, 3, n, 1);

	return 0;
}

void hanoi_tower(int a, int b, int c, int n, int flag)
{
	if (n <= 0) return;
	hanoi_tower(a, c, b, n - 1, flag);
	if (flag == 0) count++;
	else printf("%d %d\n", a, c);
	hanoi_tower(b, a, c, n - 1, flag);
}