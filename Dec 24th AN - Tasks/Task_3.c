#include <stdio.h>

// Function to find the first occurrence of x in the array
int firstOccurrence(int arr[], int n, int x) {
    int low = 0, high = n - 1, result = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == x) {
            result = mid;
            high = mid - 1; 
        } else if (arr[mid] < x) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return result;
}

int lastOccurrence(int arr[], int n, int x) {

    int low = 0, high = n - 1, result = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == x) {
            result = mid;
            low = mid + 1; 
        } else if (arr[mid] < x) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return result;
}

int main() {
    int n, x;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d sorted elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter the element to search: ");
    scanf("%d", &x);

    int first = firstOccurrence(arr, n, x);
    int last = lastOccurrence(arr, n, x);

    printf("First occurrence: %d\nLast occurrence: %d\n", first, last);

    return 0;
}