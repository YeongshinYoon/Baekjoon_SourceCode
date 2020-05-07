// 문제번호		1316
// 문제이름		그룹 단어 체커
// 문제분류		문제/단계별로 풀어보기/8_문자열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <string.h>

int main()
{
	int n, i, j, k, flag, count;
	char word[101];

	scanf("%d", &n);

	count = 0;
	for (i = 0; i < n; i++)
	{
		scanf("%s", word);
		flag = 1;
		for (j = 0; j < strlen(word) - 1; j++)
		{
			flag = 0;
			for (k = j+1; k < strlen(word); k++)
			{
				if (flag == 0)
				{
					if (word[j] != word[k] || (k == strlen(word) - 1))
						flag = 1;
				}
				else
				{
					if (word[j] == word[k])
					{
						flag = 0;
						break;
					}
				}
			}
			if (flag == 0)
				break;
		}
		if (flag == 1)
			count++;
	}

	printf("%d\n", count);
	return 0;
}