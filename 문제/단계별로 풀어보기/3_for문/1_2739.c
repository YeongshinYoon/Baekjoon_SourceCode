// 문제번호		2739
// 문제이름		구구단
// 문제분류		문제/단계별로 풀어보기/3_for문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int n = 0, i = 0;

	scanf("%d", &n);

	for (i = 1; i <= 9; i++)
	{
		printf("%d * %d = %d\n", n, i, n * i);
	}
	
	return 0;
}