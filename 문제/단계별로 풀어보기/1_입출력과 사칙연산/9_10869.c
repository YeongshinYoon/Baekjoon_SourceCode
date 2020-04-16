#include <stdio.h>

int main()
{
    int num_a = 0, num_b = 0;
    
    scanf("%d %d", &num_a, &num_b);
    printf("%d\n", num_a+num_b);
    printf("%d\n", num_a-num_b);
    printf("%d\n", num_a*num_b);
    printf("%d\n", num_a/num_b);
    printf("%d\n", num_a%num_b);
    
    return 0;
}