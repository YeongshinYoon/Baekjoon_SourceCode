// 문제번호		10250
// 문제이름		ACM 호텔
// 문제분류		문제/단계별로 풀어보기/9_수학1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int round_up(int, int);

int main()
{
	int t, h, w, n, i, floor, r_num;

	scanf("%d", &t);
	for (i = 0; i < t; i++)
	{
		scanf("%d %d %d", &h, &w, &n);
		if (n % h == 0) floor = h;
		else floor = n % h;
		r_num = floor*100 + round_up(n, h);

		printf("%d\n", r_num);
	}
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