#include <stdio.h>

int main()
{
    int rows, i, j, num;

    printf("Enter the number of rows: ");
    scanf("%d", &rows);

    for (i = 1; i <= rows; i++) {
        for (j = 1; j <= rows - i; j++) {
            printf("   ");
        }

        // Loop to print the numbers
        num = i;
        for (j = 1; j <= i; j++) {
            printf(" %d", num);
            num += 2; 
        }

        printf("\n");
    }

return 0;
}
