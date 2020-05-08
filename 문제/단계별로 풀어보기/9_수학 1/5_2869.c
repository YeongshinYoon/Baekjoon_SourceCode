// 문제번호		2869
// 문제이름		달팽이는 올라가고 싶다
// 문제분류		문제/단계별로 풀어보기/9_수학1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int round_up(int, int);

int main()
{
	int a, b, v, day;

	scanf("%d %d %d", &a, &b, &v);

	day = v - b;
	day = round_up(day, a - b);

	printf("%d\n", day);
	return 0;
}

int round_up(int a, int b)
{
	if (a % b != 0)
	{
		a /= b;
		a++;
	}
	else a /= b;

	return a;
}