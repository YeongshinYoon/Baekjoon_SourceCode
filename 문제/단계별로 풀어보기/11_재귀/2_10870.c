// 문제번호		10870
// 문제이름		피보나치 수 5
// 문제분류		문제/단계별로 풀어보기/11_재귀
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

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