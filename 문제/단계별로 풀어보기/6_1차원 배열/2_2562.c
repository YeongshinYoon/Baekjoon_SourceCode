// 문제번호		2562
// 문제이름		최댓값
// 문제분류		문제/단계별로 풀어보기/6_1차원 배열
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int arr[9] = { 0, };
	int i = 0, big = 0, pos = 0;
	
	for (i = 0; i < 9; i++)
	{
		scanf_s("%d", &arr[i]);
		if (i == 0)
		{
			big = arr[i];
			pos = i+1;
		}
		else
		{
			if (big < arr[i])
			{
				big = arr[i];
				pos = i+1;
			}
		}
	}

	printf("%d\n", big);
	printf("%d\n", pos);

	return 0;
}