// 문제번호		1157
// 문제이름		단어 공부
// 문제분류		문제/단계별로 풀어보기/8_문자열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <string.h>

int main()
{
	char word[1000001];
	int count[26] = {0,};
	int i, j, max;

	scanf("%s", word);

	for (i = 0; i < 26; i++)
	{
		for (j = 0; j < strlen(word); j++)
		{
			if ((int)word[j] == i + 65 || (int)word[j] == i + 97)
				count[i]++;
		}
	}

	max = 0;
	for (i = 1; i < 26; i++)
	{
		if (count[max] < count[i])
			max = i;
	}

	for (i = 1; i < 26; i++)
	{
		if (i == max) continue;
		if (count[max] == count[i])
		{
			printf("?\n");
			return 0;
		}
	}

	printf("%c\n", max + 65);
	return 0;
}