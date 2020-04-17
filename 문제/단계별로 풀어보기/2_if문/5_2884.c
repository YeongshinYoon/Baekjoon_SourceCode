// 문제번호		2884
// 문제이름		알람 시계
// 문제분류		문제/단계별로 풀어보기/2_if문
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
	int h = 0, m = 0;

	scanf("%d %d", &h, &m);

	if (m < 45)
	{
		m += 60;
		if (h == 0)
		{
			h = 23;
		}
		else h--;
	}

	m -= 45;

	printf("%d %d\n", h, m);

	return 0;
}