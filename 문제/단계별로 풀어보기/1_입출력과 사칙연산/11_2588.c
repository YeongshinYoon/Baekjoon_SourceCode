#include <stdio.h>

int main()
{
    int num_a = 0, num_b = 0;
    int num_b_1st = 0, num_b_2nd = 0, num_b_3rd = 0;
    
    scanf("%d %d", &num_a, &num_b);
    
    num_b_1st = num_b/100;
    num_b_2nd = (num_b - num_b_1st*100)/10;
    num_b_3rd = num_b - num_b_1st*100 - num_b_2nd*10;
    
    printf("%d\n", num_a*num_b_3rd);
    printf("%d\n", num_a*num_b_2nd);
    printf("%d\n", num_a*num_b_1st);
    printf("%d\n", num_a*num_b);
    
    return 0;
}