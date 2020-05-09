// 문제번호		3009
// 문제이름		네 번째 점
// 문제분류		문제/단계별로 풀어보기/10_수학2
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int notSameNum(int, int, int);

int main(void)
{
	int x1, y1;
	int x2, y2;
	int x3, y3;
	int x4, y4;
	

	scanf("%d %d", &x1, &y1);
	scanf("%d %d", &x2, &y2);
	scanf("%d %d", &x3, &y3);

	printf("%d %d\n", notSameNum(x1, x2, x3), notSameNum(y1, y2, y3));

	return 0;
}

int notSameNum(int n1, int n2, int n3)
{
	if (n1 == n2) return n3;
	if (n1 == n3) return n2;
	if (n2 == n3) return n1;
}