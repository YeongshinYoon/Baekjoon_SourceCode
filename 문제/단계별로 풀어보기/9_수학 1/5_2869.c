// ������ȣ		2869
// �����̸�		�����̴� �ö󰡰� �ʹ�
// �����з�		����/�ܰ躰�� Ǯ���/9_����1
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>

int round_up(int, int);

int main()
{
	int a, b, v, day;

	scanf("%d %d %d", &a, &b, &v);

	day = v - b;
	day = round_up(day, a - b);

	printf("%d\n", day);
	return 0;
}

int round_up(int a, int b)
{
	if (a % b != 0)
	{
		a /= b;
		a++;
	}
	else a /= b;

	return a;
}