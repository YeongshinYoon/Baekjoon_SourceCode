// 문제번호		9498
// 문제이름		시험 성적
// 문제분류		문제/단계별로 풀어보기/2_if문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int score = 0;

	scanf("%d", &score);

	if (score >= 90 && score <= 100)
		printf("A");
	else if (score >= 80)
		printf("B");
	else if (score >= 70)
		printf("C");
	else if (score >= 60)
		printf("D");
	else printf("F");

	return 0;
}