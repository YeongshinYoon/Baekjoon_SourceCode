// 문제번호		10039
// 문제이름		평균 점수
// 문제분류		문제/단계별로 풀어보기/5_실습1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int i = 0, avg = 0;
	int score[5] = { 0, };

	for (i = 0; i < 5; i++)
	{
		scanf("%d", &score[i]);
		if (score[i] < 40) score[i] = 40;
		avg += score[i];
	}

	avg /= 5;

	printf("%d\n", avg);

	return 0;
}