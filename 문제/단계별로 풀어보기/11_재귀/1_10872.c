// 문제번호		10872
// 문제이름		팩토리얼
// 문제분류		문제/단계별로 풀어보기/11_재귀
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

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