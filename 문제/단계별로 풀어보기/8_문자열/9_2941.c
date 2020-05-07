// 문제번호		2941
// 문제이름		크로아티아 알파벳
// 문제분류		문제/단계별로 풀어보기/8_문자열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <string.h>

int main()
{
	char word[101];
	int count, i;

	scanf("%s", word);

	count = 0;
	for (i = 0; i < strlen(word); i++)
	{
		if (word[i] == 'c')
		{
			if (word[i + 1] == '=' || word[i + 1] == '-')
				i++;
			count++;
		}
		else if (word[i] == 'd')
		{
			if (word[i + 1] == 'z')
			{
				if (word[i + 2] == '=')
					i += 2;
			}
			else if (word[i + 1] == '-')
				i++;
			count++;
		}
		else if (word[i] == 'l' || word[i] == 'n')
		{
			if (word[i + 1] == 'j')
				i++;
			count++;
		}
		else if (word[i] == 's' || word[i] == 'z')
		{
			if (word[i + 1] == '=')
				i++;
			count++;
		}
		else count++;
	}

	printf("%d\n", count);
	return 0;
}