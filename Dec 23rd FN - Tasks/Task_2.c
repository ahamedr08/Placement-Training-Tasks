#include <stdio.h>
#include <stdbool.h>
bool canJump(int* nums, int numsSize) {
    int maxReach = 0;
    for (int i = 0; i < numsSize; ++i) {
        if (i > maxReach) {
            return false;
        }
        maxReach = (i + nums[i] > maxReach) ? i + nums[i] : maxReach;
        if (maxReach >= numsSize - 1) {
            return true;
        }
    }
    return false; 
}
int main() {
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    int* nums = (int*) malloc(size * sizeof(int));
    if (nums == NULL) {
        perror("Memory allocation error");
        return 1;
    }
    printf("Input: nums = ");
    for (int i = 0; i < size; ++i) {
        scanf("%d", &nums[i]);
    }
    bool result = canJump(nums, size);
    printf("Output: %s\n", result ? "true" : "false");
    free(nums);
    return 0;
}