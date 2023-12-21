// Evaluate a polynomial of degree n.
#include <stdio.h>

int main() 
{
    int totalDays, years, weeks, daysLeft;

    printf("Enter total days:\n");
    scanf("%d", &totalDays);

    years = totalDays / 365;
    weeks = (totalDays % 365) / 7;
    daysLeft = (totalDays % 365) % 7;


    printf("Number of Years: %d\n", years);
    printf("Number of Weeks: %d\n", weeks);
    printf("Number of Days: %d\n", daysLeft);
    return 0;
}