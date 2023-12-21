// Calculate the number of years,weeks and the remaining days for the given total days
#include <stdio.h>

int main() {
    int degree, x;
    printf("Enter the degree of the polynomial: ");
    scanf("%d", &degree);

    int coefficients[degree + 1];
    printf("Enter the coefficients: ");
    for (int i = degree; i >= 0; i--) {
        scanf("%d", &coefficients[i]);
    }

    printf("Enter the value of x: ");
    scanf("%d", &x);

    int result = 0;
    for (int i = degree; i >= 0; i--) {
        result = result * x + coefficients[i];
    }

    printf("P(%d) = %d\n", x, result);

    return 0;
}