// 문제번호		2675
// 문제이름		문자열 반복
// 문제분류		문제/단계별로 풀어보기/8_문자열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
	int n1, n2, i, j, k;
	char arr[21];

	scanf("%d", &n1);
	for (i = 0; i < n1; i++)
	{
		scanf("%d %s", &n2, arr);
		for (j = 0; j < strlen(arr); j++)
		{
			for (k = 0; k < n2; k++)
				printf("%c", arr[j]);
		}
		printf("\n");
	}

	return 0;
}