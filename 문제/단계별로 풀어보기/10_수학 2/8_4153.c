// 문제번호		4153
// 문제이름		직각삼각형
// 문제분류		문제/단계별로 풀어보기/10_수학2
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main(void)
{
	int x, y, z;

	while (1)
	{
		scanf("%d %d %d", &x, &y, &z);
		if (x == 0 && y == 0 && z == 0) break;
		if (x * x + y * y == z * z
			|| x * x + z * z == y * y
			|| y * y + z * z == x * x) printf("right\n");
		else printf("wrong\n");
	}

	return 0;
}