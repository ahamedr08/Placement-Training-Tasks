// Calculate the area of square or circle based on the shape ‘S’ for Square and ‘C’ for Circle.

#include <stdio.h>
#include <math.h>

void calculateArea(char shape, float size) {
    
    float area;

    if (shape == 'S') {
        area = size * size;
        printf("Area of Square = %.2f\n", area);
    } else if (shape == 'C') {
        area = M_PI * size * size;
        printf("Area of Circle = %.2f\n", area);
    } else {
        printf("Invalid shape input. Please enter 'S' for square or 'C' for circle.\n");
    }
}

int main() 
{
    char shape;
    float size;

    printf("Enter the shape ('S' for square or 'C' for circle): ");
    scanf(" %c", &shape);

    printf("Enter the size: ");
    scanf("%f", &size);

    calculateArea(shape, size);

    return 0;
}
