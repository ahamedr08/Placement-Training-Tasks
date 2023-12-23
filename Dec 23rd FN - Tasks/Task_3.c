#include <stdio.h>
#include <stdlib.h>
int maxSubArray(int* nums, int numsSize) {
    if (numsSize == 0) {
        return 0;
    }
    int maxEndingHere = nums[0];
    int maxSoFar = nums[0];

    for (int i = 1; i < numsSize; ++i) {
        maxEndingHere = (maxEndingHere + nums[i] > nums[i]) ? maxEndingHere + nums[i] : nums[i];
        maxSoFar = (maxEndingHere > maxSoFar) ? maxEndingHere : maxSoFar;
    }
    return maxSoFar;
}
int main() 
{
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    int* nums = (int*)malloc(size * sizeof(int));
    if (nums == NULL) {
        perror("Memory allocation error");
        return 1;
    }
    printf("Enter the elements of the array: ");
    for (int i = 0; i < size; ++i) {
        scanf("%d", &nums[i]);
    }
    int result = maxSubArray(nums, size);
    printf("Result: %d\n", result);
    free(nums);
    return 0;
}

