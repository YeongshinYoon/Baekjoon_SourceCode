// ������ȣ		10870
// �����̸�		�Ǻ���ġ �� 5
// �����з�		����/�ܰ躰�� Ǯ���/11_���
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>

int fib(int);

int main(void)
{
	int n;

	scanf("%d", &n);

	printf("%d\n", fib(n));

	return 0;
}

int fib(int n)
{
	if (n <= 1) return n;
	return fib(n - 1) + fib(n - 2);
}