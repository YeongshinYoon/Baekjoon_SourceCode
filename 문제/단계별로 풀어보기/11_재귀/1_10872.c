// ������ȣ		10872
// �����̸�		���丮��
// �����з�		����/�ܰ躰�� Ǯ���/11_���
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>

int fact(int);

int main(void)
{
	int n;

	scanf("%d", &n);

	printf("%d\n", fact(n));

	return 0;
}

int fact(int n)
{
	if (n <= 1) return 1;
	return n * fact(n - 1);
}