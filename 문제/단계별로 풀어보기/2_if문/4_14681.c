// 문제번호		14681
// 문제이름		사분면 고르기
// 문제분류		문제/단계별로 풀어보기/2_if문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int x = 0, y = 0;

	scanf_s("%d %d", &x, &y);

	if (x > 0)
	{
		if (y > 0)
			printf("1\n");
		else if (y < 0)
			printf("4\n");
	}
	else if (x < 0)
	{
		if (y > 0)
			printf("2\n");
		else if (y < 0)
			printf("3\n");
	}

	return 0;
}