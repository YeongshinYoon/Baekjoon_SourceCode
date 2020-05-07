// 문제번호		1152
// 문제이름		단어의 개수
// 문제분류		문제/단계별로 풀어보기/8_문자열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <string.h>

int main()
{
	char string[1000001];
	char* tok;
	int count = 0;

	scanf("%[^\n]", string);

	tok = strtok(string, " ");
	while (tok != NULL)
	{
		count++;
		tok = strtok(NULL, " ");
	}

	printf("%d\n", count);
	return 0;
}