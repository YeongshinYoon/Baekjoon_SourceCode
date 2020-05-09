// 문제번호		3053
// 문제이름		택시 기하학
// 문제분류		문제/단계별로 풀어보기/10_수학2
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <math.h>

int main(void)
{
	double r;
	const double pi = acos(-1);

	scanf("%lf", &r);
	printf("%lf\n", r*r*pi);
	printf("%lf\n", 2*r*r);

	return 0;
}