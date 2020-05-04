// 문제번호		1065
// 문제이름		한수
// 문제분류		문제/단계별로 풀어보기/7_함수
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int countDigit(int);
int* numToDigitArr(int);
int isIsometric(int, int);

int main()
{
	int n, i, count;

	scanf("%d", &n);

	count = 0;
	for (i = 1; i <= n; i++)
	{
		if (isIsometric(i, countDigit(i)))
			count++;
	}

	printf("%d\n", count);
	return 0;
}

int countDigit(int n)
{
	int count = 0;

	while (1)
	{
		count++;
		n /= 10;
		if (n == 0)
			break;
	}

	return count;
}

int* numToDigitArr(int n)
{
	int digits = countDigit(n);
	int* digitArr;
	int i = 0, exp = 0;

	digitArr = (int*)malloc(sizeof(int) * digits);
	if (digitArr == NULL)
		exit(1);

	for (i = 0; i < digits; i++)
	{
		exp = digits - i - 1;
		digitArr[i] = n / (int)pow(10, exp);
		n -= digitArr[i] * (int)pow(10, exp);
	}

	return digitArr;
}

int isIsometric(int n, int count)
{
	int* digitArr;
	int i = 0;
	int diff;

	if (count <= 2)
		return 1;

	digitArr = numToDigitArr(n);
	if (digitArr == NULL)
		exit(1);
	diff = digitArr[0] - digitArr[1];
	for (i = 1; i < count-1; i++)
	{
		if (diff != (digitArr[i] - digitArr[i + 1]))
			return 0;
	}

	return 1;
}