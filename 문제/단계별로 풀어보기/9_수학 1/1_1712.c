// 문제번호		1712
// 문제이름		손익분기점
// 문제분류		문제/단계별로 풀어보기/9_수학 1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	long long int a, b, c, break_even_point;

	scanf("%lld %lld %lld", &a, &b, &c);

	if (b >= c) break_even_point = -1;
	else break_even_point = (a / (c - b)) + 1;

	printf("%lld\n", break_even_point);
	return 0;
}