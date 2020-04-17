// 문제번호		1008
// 문제이름		A/B
// 문제분류		문제/단계별로 풀어보기/1_입출력과 사칙연산
// 문제출처		acmicpc.net
// 코드작성자	YOON Yeongshin

#include <stdio.h>

int main()
{
    int num_a = 0, num_b = 0;
    double result = 0;
    
    scanf("%d %d", &num_a, &num_b);
    result = num_a / (double)num_b;
    printf("%.32g\n", result);
    
    return 0;
}