#include <stdio.h>

// Function to check if there exist two elements whose sum is X
int hasPairWithSum(int arr[], int n, int x) {

    int hash[100000] = {0};

    for (int i = 0; i < n; i++) {
        int complement = x - arr[i];

        if (hash[complement] == 1)
            return 1;

        hash[arr[i]] = 1;
    }

    return 0;
}

int main() {

    int N, X;

    printf("Enter the size of the array: ");
    scanf("%d", &N);

    int Arr[N];

    printf("Enter %d elements:\n", N);
    for (int i = 0; i < N; i++) {
        scanf("%d", &Arr[i]);
    }

    printf("Enter the target sum: ");
    scanf("%d", &X);

    if (hasPairWithSum(Arr, N, X))
        printf("Yes, there exist two elements with sum %d\n", X);
    else
        printf("No, there are no two elements with sum %d\n", X);

    return 0;
}