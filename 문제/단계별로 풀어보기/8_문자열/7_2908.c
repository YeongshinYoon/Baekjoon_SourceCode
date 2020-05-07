// 문제번호		2908
// 문제이름		상수
// 문제분류		문제/단계별로 풀어보기/8_문자열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <math.h>

int main()
{
	char n1[4], n2[4];
	int n3, n4, i;

	scanf("%s %s", n1, n2);

	n3 = 0;
	n4 = 0;
	for (i = 0; i < 3; i++)
	{
		n3 += ((n1[i]-48) * (int)pow(10, i));
		n4 += ((n2[i]-48) * (int)pow(10, i));
	}

	if (n3 > n4) printf("%d\n", n3);
	else printf("%d\n", n4);

	return 0;
}