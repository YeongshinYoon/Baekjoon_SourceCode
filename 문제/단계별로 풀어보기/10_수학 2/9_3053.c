// ������ȣ		3053
// �����̸�		�ý� ������
// �����з�		����/�ܰ躰�� Ǯ���/10_����2
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>
#include <math.h>

int main(void)
{
	double r;
	const double pi = acos(-1);

	scanf("%lf", &r);
	printf("%lf\n", r*r*pi);
	printf("%lf\n", 2*r*r);

	return 0;
}