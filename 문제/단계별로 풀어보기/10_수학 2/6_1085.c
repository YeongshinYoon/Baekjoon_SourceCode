// 문제번호		1085
// 문제이름		직사각형에서 탈출
// 문제분류		문제/단계별로 풀어보기/10_수학2
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int minToWidth(int, int);
int minToHeight(int, int);

int main()
{
	int x, y, w, h;
	int min_w, min_h;

	scanf("%d %d %d %d", &x, &y, &w, &h);

	min_w = minToWidth(y, h);
	min_h = minToHeight(x, w);
	if (min_w > min_h) printf("%d\n", min_h);
	else printf("%d\n", min_w);

	return 0;
}

int minToWidth(int y, int h)
{
	if (h > 2 * y) return y;
	else return h - y;
}

int minToHeight(int x, int w)
{
	if (w > 2 * x) return x;
	else return w - x;
}