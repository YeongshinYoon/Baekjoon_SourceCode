// 문제번호		8958
// 문제이름		OX퀴즈
// 문제분류		문제/단계별로 풀어보기/6_1차원 배열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
	int n = 0, i = 0, j = 0, count = 0, sum = 0;
	char** arr = NULL;

	scanf("%d", &n);
	arr = (char**)malloc(sizeof(char*) * n);

	for (i = 0; i < n; i++)
	{
		sum = 0;
		count = 0;
		arr[i] = (char*)malloc(sizeof(char) * 80);
		scanf("%s", arr[i]);
		for (j = 0; j < strlen(arr[i]); j++)
		{
			switch (arr[i][j])
			{
			case 'O':
				count++;
				sum += count;
				break;
			case 'X':
				count = 0;
				break;
			default:
				break;
			}
		}
		printf("%d\n", sum);
	}
	return 0;
}