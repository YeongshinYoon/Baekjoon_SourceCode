// ������ȣ		3009
// �����̸�		�� ��° ��
// �����з�		����/�ܰ躰�� Ǯ���/10_����2
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>

int notSameNum(int, int, int);

int main(void)
{
	int x1, y1;
	int x2, y2;
	int x3, y3;
	int x4, y4;
	

	scanf("%d %d", &x1, &y1);
	scanf("%d %d", &x2, &y2);
	scanf("%d %d", &x3, &y3);

	printf("%d %d\n", notSameNum(x1, x2, x3), notSameNum(y1, y2, y3));

	return 0;
}

int notSameNum(int n1, int n2, int n3)
{
	if (n1 == n2) return n3;
	if (n1 == n3) return n2;
	if (n2 == n3) return n1;
}