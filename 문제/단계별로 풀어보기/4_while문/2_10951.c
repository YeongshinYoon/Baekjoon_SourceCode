// 문제번호		10951
// 문제이름		A+B - 4
// 문제분류		문제/단계별로 풀어보기/4_while문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int a = 0, b = 0, count = 0, i = 0, isEOF = 0;
	char c;
	int* arr = NULL;

	while (1)
	{
		isEOF = scanf("%d %d", &a, &b);
		if (isEOF == EOF)
			break;
		count++;
		arr = (int*)realloc(arr, sizeof(int) * count);
		if (arr == NULL)
			exit(1);
		else arr[count - 1] = a + b;
	}

	for (i = 0; i < count; i++)
		printf("%d\n", arr[i]);

	return 0;
}