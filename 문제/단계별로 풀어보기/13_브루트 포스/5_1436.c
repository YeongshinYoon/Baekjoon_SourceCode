// 문제번호		1436
// 문제이름		영화감독 숌
// 문제분류		문제/단계별로 풀어보기/13_브루트 포스
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int isEndNum(int);
int numOfDigits(int);
int numOfSequential6(int);

int main(void)
{
	int n, cur, count, temp, flag, add;

	scanf("%d", &n);

	flag = 0;
	temp = 0;
	count = 0;
	cur = 666;

	while (1)
	{
		if (isEndNum(cur) == 1) count++;
		if (count == n) break;
		cur++;
	}

	printf("%d\n", cur);
	return 0;
}

int isEndNum(int n)
{
	if (numOfSequential6(n) >= 3) return 1;
	return 0;
}

int numOfDigits(int n)
{
	int count = 0;

	while (1)
	{
		n /= 10;
		count++;
		if (n == 0) break;
	}

	return count;
}

int numOfSequential6(int n)
{
	int i, temp, digits, count, temp_count;

	digits = numOfDigits(n);
	temp_count = 0;
	count = 0;
	for (i = 0; i < digits; i++)
	{
		temp = n / (int)pow(10, digits - 1 - i);
		if (temp == 6) temp_count++;
		else
		{
			if (temp_count >= 3) count = temp_count;
			temp_count = 0;
		}
		n -= (temp * (int)pow(10, digits - 1 - i));
	}

	if (temp_count >= 3) count = temp_count;
	return count;
}