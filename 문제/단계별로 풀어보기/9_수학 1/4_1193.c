// 문제번호		1193
// 문제이름		분수찾기
// 문제분류		문제/단계별로 풀어보기/9_수학 1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int x, i;
	int start, end, seq;

	scanf("%d", &x);

		seq = 1;
		start = 0;
		end = 0;

		while (1)
		{
			start = end + 1;
			end = (seq * (seq + 1)) / 2;
			if (x >= start && x <= end)
			{
				for (i = start; i <= end; i++)
				{
					if (x == i)
					{
						if (seq % 2 == 0)
							printf("%d/%d\n", (i - start + 1), (seq - (i - start)));
						else printf("%d/%d\n", (seq - (i - start)), (i - start + 1));
						return 0;
					}
				}
			}
			seq++;
		}
	
	return 0;
}