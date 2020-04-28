// 문제번호		10817
// 문제이름		세 수
// 문제분류		문제/단계별로 풀어보기/5_실습1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int a = 0, b = 0, c = 0;

	scanf("%d %d %d", &a, &b, &c);

	if (a >= b && a <= c || a >= c && a <= b) printf("%d\n", a);
	else if (b >= a && b <= c || b >= c && b <= a) printf("%d\n", b);
	else if (c >= a && c <= b || c >= b && c <= a) printf("%d\n", c);

	return 0;
}