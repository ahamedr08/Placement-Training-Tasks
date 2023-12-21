// Check the given password is said to be strong or not

#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <ctype.h>

bool isStrongPassword(char *password) {
    int length = strlen(password);
    bool hasLowerCase = false, hasUpperCase = false, hasDigit = false, hasSpecialChar = false;

    for (int i = 0; i < length; i++) {
        if (islower(password[i])) {
            hasLowerCase = true;
        } else if (isupper(password[i])) {
            hasUpperCase = true;
        } else if (isdigit(password[i])) {
            hasDigit = true;
        } else if (strchr("!@#$%^&*()-+", password[i]) != NULL) {
            hasSpecialChar = true;
        }
    }

    return length >= 8 && hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar;
}

int main() {
    char password[100];

    printf("Enter a password: ");
    scanf("%s", password);

    if (isStrongPassword(password)) {
        printf("The password is strong.\n");
    } else {
        printf("The password is not strong.\n");
    }

    return 0;
}
