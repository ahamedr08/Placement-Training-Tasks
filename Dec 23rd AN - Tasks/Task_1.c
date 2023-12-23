#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool areAnagrams(char *s, char *t) {
    
    if (strlen(s) != strlen(t)) {
        return false;
    }

    int count[26] = {0}; // Assuming only lowercase alphabetical characters
    
    for (int i = 0; s[i] != '\0'; i++) {
        count[s[i] - 'a']++;
    }

    for (int i = 0; t[i] != '\0'; i++) {
        count[t[i] - 'a']--;
    }

    for (int i = 0; i < 26; i++) {
        if (count[i] != 0) {
            return false;
        }
    }
    
    return true;
}

int main() {
    char s[100], t[100];

    printf("Enter the first string: ");
    scanf("%s", s);

    printf("Enter the second string: ");
    scanf("%s", t);

    printf("Result: %s\n", areAnagrams(s, t) ? "true" : "false");

    return 0;
}
