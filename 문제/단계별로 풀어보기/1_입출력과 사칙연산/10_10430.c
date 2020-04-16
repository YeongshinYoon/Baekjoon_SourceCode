#include <stdio.h>

int main()
{
    int num_a = 0, num_b = 0, num_c = 0;
    
    scanf("%d %d %d", &num_a, &num_b, &num_c);
    printf("%d\n", (num_a+num_b)%num_c);
    printf("%d\n", (num_a%num_c + num_b%num_c)%num_c);
    printf("%d\n", (num_a*num_b)%num_c);
    printf("%d\n", (num_a%num_c * num_b%num_c)%num_c);
    
    return 0;
}