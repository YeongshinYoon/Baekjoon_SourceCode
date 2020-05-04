// 문제번호		15596
// 문제이름		정수 N개의 합
// 문제분류		문제/단계별로 풀어보기/7_함수
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

long long sum(int*, int);

int main()
{


	return 0;
}

long long sum(int* a, int n)
{
	int i = 0, sum = 0;

	for (i = 0; i < n; i++)
		sum += a[i];

	return sum;
}