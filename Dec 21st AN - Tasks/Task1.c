/* Get three values x, y, z and write a program to
 print 1 if x is the middle value, 2 if y is the middle value and 3 if z is the middle value. 
 Assume that all three variables (x, y, z) are distinct and have different values. */

#include <stdio.h>

int main()
{
    
int x, y, z;

printf("Enter the value of x: ");
scanf("%d", &x);
printf("Enter the value of y: ");
scanf("%d", &y);
printf("Enter the value of z: ");
scanf("%d", &z);

if ((x > y && x < z) || (x < y && x > z)) 
{
printf("1\n");
}

else if ((y > x && y < z) || (y < x && y > z))
{
printf("2\n");
}

else
{
printf("3\n");
}

return 0;
}
