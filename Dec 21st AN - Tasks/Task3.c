#include <stdio.h>

int main()
{
  
    int totalHoursNeeded, numDays, numWorkers;

    printf("Enter the total number of hours needed: ");
    scanf("%d", &totalHoursNeeded);

    printf("Enter the number of days available: ");
    scanf("%d", &numDays);

    printf("Enter the number of workers: ");
    scanf("%d", &numWorkers);

    int normalWorkingHours = 8;
    int trainingDaysPercentage = 10;
    int overtimeHours = 2;

    int totalAvailableHours = numDays * (normalWorkingHours * numWorkers);

    int trainingDays = (numDays * trainingDaysPercentage) / 100;

    totalAvailableHours -= trainingDays * (normalWorkingHours * numWorkers);

    totalAvailableHours += numDays * (overtimeHours * numWorkers);

    // Check if there is enough time
    if (totalAvailableHours >= totalHoursNeeded) {
        int hoursLeft = totalAvailableHours - totalHoursNeeded;
        printf("Yes! %d hours left.\n", hoursLeft);
    } else {
        int additionalHoursNeeded = totalHoursNeeded - totalAvailableHours;
        printf("Not enough time! %d hours needed.\n", additionalHoursNeeded);
    }

    return 0;
}
