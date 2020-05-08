// 문제번호		1011
// 문제이름		Fly me to the Alpha Centauri
// 문제분류		문제/단계별로 풀어보기/9_수학1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int t, i;
	unsigned int d, start, end;
	int x, y, increment, index;
	int count;

	scanf("%d", &t);
	{
		for (i = 0; i < t; i++)
		{
			scanf("%d %d", &x, &y);
			d = y - x;
			index = 1;
			increment = 1;
			while (1)
			{
				start = index;
				end = index + increment;
				count = 2 * increment - 1;
				if (d >= start && d < end)
					break;

				start = end;
				end = start + increment;
				count = 2 * increment;
				if (d >= start && d < end)
					break;

				index += 2 * increment;
				increment++;
			}
			printf("%d\n", count);
		}
	}

	return 0;
}

