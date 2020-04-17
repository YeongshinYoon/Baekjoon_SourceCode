// 문제번호		2753
// 문제이름		윤년
// 문제분류		문제/단계별로 풀어보기/2_if문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int year = 0;

	scanf("%d", &year);

	if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0))
	{
		printf("1");
	}
	else printf("0");

	return 0;
}