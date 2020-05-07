// 문제번호		11720
// 문제이름		숫자의 합
// 문제분류		문제/단계별로 풀어보기/8_문자열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	char* numString;
	int count, i, sum;

	scanf("%d", &count);
	numString = (char*)malloc(sizeof(char) * (count + 1));
	
	if (numString == NULL) exit(1);

	scanf("%s", numString);
	sum = 0;
	for (i = 0; i < count; i++)
		sum += (int)numString[i] - 48;

	printf("%d\n", sum);

	return 0;
}