// 문제번호		10952
// 문제이름		A+B - 5
// 문제분류		문제/단계별로 풀어보기/4_while문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int a = 0, b = 0, count = 0, i = 0;
	int* arr = NULL;

	while (1)
	{
		scanf("%d %d", &a, &b);
		if (a == 0 && b == 0)
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