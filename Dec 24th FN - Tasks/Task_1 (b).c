// Swapping of two Numbers by Call By Reference
 
#include <stdio.h>

void swapByReference(int *a, int *b);

int main() {
    int num1, num2;

    // Input two numbers
    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);

    printf("Original numbers: %d, %d\n", num1, num2);

    swapByReference(&num1, &num2);

    // Display numbers after swapping (changed due to Call By Reference)
    printf("Numbers after swapping (Call By Reference): %d, %d\n", num1, num2);

    return 0;
}

void swapByReference(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
