// 문제번호		11729
// 문제이름		하노이 탑 이동 순서
// 문제분류		문제/단계별로 풀어보기/11_재귀
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

void hanoi_tower(int, int, int, int, int);
int count;

int main(void)
{
	int n;

	scanf("%d", &n);

	hanoi_tower(1, 2, 3, n, 0);
	printf("%d\n", count);
	hanoi_tower(1, 2, 3, n, 1);

	return 0;
}

void hanoi_tower(int a, int b, int c, int n, int flag)
{
	if (n <= 0) return;
	hanoi_tower(a, c, b, n - 1, flag);
	if (flag == 0) count++;
	else printf("%d %d\n", a, c);
	hanoi_tower(b, a, c, n - 1, flag);
}