// 문제번호		5622
// 문제이름		다이얼
// 문제분류		문제/단계별로 풀어보기/8_문자열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int charToNum(char);

int main()
{
	char word[16];
	int time, i;

	scanf("%s", word);

	time = 0;
	for (i = 0; i < strlen(word); i++)
		time += (charToNum(word[i]) + 1);

	printf("%d\n", time);
	return 0;
}

int charToNum(char c)
{
	if (c >= 87)
		return 9;
	if (c >= 84)
		return 8;
	if (c >= 80)
		return 7;
	if (c >= 77)
		return 6;
	if (c >= 74)
		return 5;
	if (c >= 71)
		return 4;
	if (c >= 68)
		return 3;
	if (c >= 65)
		return 2;
}