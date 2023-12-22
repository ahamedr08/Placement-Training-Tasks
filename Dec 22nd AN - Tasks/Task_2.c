#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

void generateOutput(char input[]) {
    char currentChar = '\0';
    int repeatCount = 0;

    for (int i = 0; input[i] != '\0'; i++) {
        if (isdigit(input[i])) {
            repeatCount = repeatCount * 10 + (input[i] - '0');
        } else {
            while (repeatCount > 0) {
                printf("%c", currentChar);
                repeatCount--;
            }
            currentChar = input[i];
        }
    }

    while (repeatCount > 0) {
        printf("%c", currentChar);
        repeatCount--;
    }

    printf("\n");
}

int main() {
    char input[100];

    printf("Enter input string: ");
    fgets(input, sizeof(input), stdin);

    size_t length = strlen(input);
    if (input[length - 1] == '\n') {
        input[length - 1] = '\0';
    }

    generateOutput(input);

    return 0;
}

