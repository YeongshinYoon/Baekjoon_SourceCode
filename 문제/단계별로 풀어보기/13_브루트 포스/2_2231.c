// ������ȣ		2231
// �����̸�		������
// �����з�		����/�ܰ躰�� Ǯ���/13_���Ʈ ����
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int get_digits(int);
int get_digit(int, int);

int main(void)
{
	int n, i, j, digits, new_n;

	scanf("%d", &n);

	i = 0;
	while (1)
	{
		digits = get_digits(i);
		new_n = i;
		for (j = 0; j < digits; j++) new_n += get_digit(i, j + 1);
		if (new_n == n) break;
		i++;
		if (i > n)
		{
			i = 0;
			break;
		}
	}

	printf("%d\n", i);

	return 0;
}

int get_digits(int n)
{
	int digits;

	digits = 0;
	while (1)
	{
		n /= 10;
		digits++;
		if (n == 0) break;
	}

	return digits;
}

int get_digit(int n, int seq)
{
	int digits, i, exp, temp;

	digits = get_digits(n);
	exp = digits - 1;
	temp = n / (int)pow(10, exp);
	if (seq == 1) return temp;

	for (i = 1; i < digits; i++)
	{
		n -= (temp * (int)pow(10, exp));
		exp = digits - i - 1;
		temp = n / (int)pow(10, exp);
		if (seq == i + 1) return temp;
	}

	return -1;
}