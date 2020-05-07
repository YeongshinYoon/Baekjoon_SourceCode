// 문제번호		10809
// 문제이름		알파벳 찾기
// 문제분류		문제/단계별로 풀어보기/8_문자열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <string.h>

int main()
{
	char word[101];
	int i, j;
	scanf("%s", word);

	for (i = 97; i <= 122; i++)
	{
		for (j = 0; j < strlen(word); j++)
		{
			if ((int)word[j] == i)
			{
				printf("%d ", j);
				break;
			}
		}
		if (j == strlen(word))
			printf("-1 ");
	}
	printf("\n");

	return 0;
}