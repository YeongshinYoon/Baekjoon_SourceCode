// 문제번호		1002
// 문제이름		터렛
// 문제분류		문제/단계별로 풀어보기/10_수학2
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <math.h>

double min(double, double);
double max(double, double);

int main(void)
{
	double x1, y1, r1, x2, y2, r2, d1, d2;
	int n, i;

	scanf("%d", &n);

	for (i = 0; i < n; i++)
	{
		scanf("%lf %lf %lf %lf %lf %lf", &x1, &y1, &r1, &x2, &y2, &r2);
		if (x1 == x2 && y1 == y2)
		{
			if (r1 == r2) printf("-1\n");
			else printf("0\n");
		}
		else
		{
			d1 = pow((x1 - x2), 2);
			d1 += pow((y1 - y2), 2);
			d1 = sqrt(d1);
			d2 = r1 + r2;
			if ((d1 + min(r1, r2) > max(r1, r2)) && (d1 < d2)) printf("2\n");
			else if (d1 + r1 == r2 || d1 + r2 == r1) printf("1\n");
			else if ((d1 + min(r1, r2) < max(r1, r2))) printf("0\n");
			else
			{
				if (d1 > d2) printf("0\n");
				else if (d1 == d2) printf("1\n");
				else printf("2\n");
			}
		}
	}

	return 0;
}

double min(double a, double b)
{
	if (a < b) return a;
	else return b;
}

double max(double a, double b)
{
	if (a > b) return a;
	else return b;
}