#include <stdio.h>
#include <stdlib.h>

int* findDuplicates(int a[], int N, int* resultSize) {
    
    int* duplicates = NULL;
    int* count = (int*)calloc(N, sizeof(int));

    for (int i = 0; i < N; i++) {
        count[a[i]]++;
    }

    int numDuplicates = 0;
    for (int i = 0; i < N; i++) {
        if (count[i] > 1) {
            numDuplicates++;
        }
    }

    if (numDuplicates == 0) {
        duplicates = (int*)malloc(sizeof(int));
        duplicates[0] = -1;
        *resultSize = 1;
        free(count);
        return duplicates;
    }

    duplicates = (int*)malloc(numDuplicates * sizeof(int));

    int index = 0;
    for (int i = 0; i < N; i++) {
        if (count[i] > 1) {
            duplicates[index++] = i;
        }
    }

    *resultSize = numDuplicates;
    free(count);
    return duplicates;
}

int main() {
    int N;
    printf("Enter the size of the array: ");
    scanf("%d", &N);

    int* a = (int*)malloc(N * sizeof(int));

    printf("Enter the elements of the array: ");
    for (int i = 0; i < N; i++) {
        scanf("%d", &a[i]);
    }

    int resultSize;
    int* duplicates = findDuplicates(a, N, &resultSize);

    printf("Output: ");
    for (int i = 0; i < resultSize; i++) {
        printf("%d ", duplicates[i]);
    }

    free(a);
    free(duplicates);

    return 0;
}


