// ������ȣ		1002
// �����̸�		�ͷ�
// �����з�		����/�ܰ躰�� Ǯ���/10_����2
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

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