#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void justifySentence(char sentence[], int screenLength) 
{
    int length = strlen(sentence);
    
    int spaceCount = 0;
    for (int i = 0; i < length; i++) {
        if (sentence[i] == ' ') {
            spaceCount++;
        }
    }

    int extraSpaces = screenLength - length + spaceCount;

    int spacesBetweenWords = extraSpaces / spaceCount;

    int remainingSpaces = extraSpaces % spaceCount;

    for (int i = 0; i < length; i++) {
        if (sentence[i] == ' ') {
            int starsToAdd = spacesBetweenWords + (remainingSpaces > 0 ? 1 : 0);
            for (int j = 0; j < starsToAdd; j++) {
                printf("*");
            }
            remainingSpaces--;
        } else {
            printf("%c", sentence[i]);
        }
    }

    printf("\n");
}

int main()
{

    char sentence[100];
    printf("Enter the sentence: ");
    fgets(sentence, sizeof(sentence), stdin);
    sentence[strcspn(sentence, "\n")] = '\0';

    int screenLength;
    printf("Enter the screen length: ");
    scanf("%d", &screenLength);
    
    justifySentence(sentence, screenLength);

    return 0;
}
