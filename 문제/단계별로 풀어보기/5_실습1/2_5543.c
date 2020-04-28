// 문제번호		5543
// 문제이름		상근날드
// 문제분류		문제/단계별로 풀어보기/5_실습1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int a, b, c, d, e;
	int cheap_1 = 0, cheap_2 = 0;
	int sum = 0;

	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);
	scanf("%d", &d);
	scanf("%d", &e);

	cheap_1 = a;
	cheap_2 = d;

	if (cheap_1 > b)
		cheap_1 = b;
	if (cheap_1 > c)
		cheap_1 = c;
	if (cheap_2 > e)
		cheap_2 = e;
	
	sum = cheap_1 + cheap_2 - 50;
	printf("%d\n", sum);

	return 0;
}