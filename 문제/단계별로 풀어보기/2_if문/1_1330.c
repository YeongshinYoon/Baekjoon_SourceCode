// 문제번호		1330
// 문제이름		두 수 비교하기
// 문제분류		문제/단계별로 풀어보기/2_if문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int a = 0, b = 0;

	scanf("%d %d", &a, &b);

	if (a > b)
		printf(">");
	else if (a == b)
		printf("==");
	else printf("<");

	return 0;
}