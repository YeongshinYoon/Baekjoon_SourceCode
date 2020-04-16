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