// Swapping of two Numbers by Call By Value

#include <stdio.h>

void swapByValue(int a, int b);

int main() {
    
    int num1, num2;

    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);

    printf("Original numbers: %d, %d\n", num1, num2);

    swapByValue(num1, num2);

    // Display numbers after swapping (no change due to Call By Value)
    printf("Numbers after swapping (Call By Value): %d, %d\n", num1, num2);

    return 0;
}

void swapByValue(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}
