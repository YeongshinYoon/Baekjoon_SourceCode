// 문제번호		2292
// 문제이름		벌집
// 문제분류		문제/단계별로 풀어보기/9_수학 1
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int n, i, div, start, end;

	scanf("%d", &n);

	i = 1;
	start = i;
	end = i;
	while (1)
	{
		if (n >= start && n <= end)
		{
			printf("%d\n", i);
			break;
		}
		i++;
		div = 6 * (i - 1);
		start = end + 1;
		end = start + div - 1;
	}
	
	return 0;
}