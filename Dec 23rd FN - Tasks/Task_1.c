#include <stdio.h>
#include <stdlib.h>
int* plusOne(int* digits, int digitsSize, int* returnSize) {
    digits[digitsSize - 1] += 1;
    for (int i = digitsSize - 1; i > 0 && digits[i] == 10; --i) {
        digits[i] = 0;
        digits[i - 1] += 1;
    }
    if (digits[0] == 10) {
        digits[0] = 0;
        (*returnSize) = digitsSize + 1;
        int* result = (int*)malloc((*returnSize) * sizeof(int));
        result[0] = 1;
        for (int i = 1; i < (*returnSize); ++i) {
            result[i] = digits[i - 1];
        }
        return result;
    } else {
        (*returnSize) = digitsSize;
        return digits;
    }
}
int main() {
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    int* digits = (int*)malloc(size * sizeof(int));
    if (digits == NULL) {
        perror("Memory allocation error");
        exit(EXIT_FAILURE);
    }
    printf("Input: ");
    for (int i = 0; i < size; ++i) {
        scanf("%d", &digits[i]);
    }
    int returnSize;
    int* result = plusOne(digits, size, &returnSize);
    printf("Output: ");
    for (int i = 0; i < returnSize; ++i) {
        printf("%d ", result[i]);
    }
    printf("\n");
    return 0;
}