#include <stdio.h>

// Function to find the second largest distinct element
int findSecondLargest(int arr[], int n) {
    int first = arr[0], second = -1;

    for (int i = 1; i < n; i++) {
        if (arr[i] > first) {
            second = first;
            first = arr[i];
        } else if (arr[i] < first && arr[i] > second) {
            second = arr[i];
        }
    }

    return second;
}

int main() {
    
    int N;

    printf("Enter the size of the array: ");
    scanf("%d", &N);

    int Arr[N];

    printf("Enter %d elements:\n", N);
    for (int i = 0; i < N; i++) {
        scanf("%d", &Arr[i]);
    }

    int result = findSecondLargest(Arr, N);
    printf("The second largest distinct element is: %d\n", result);

    return 0;
}