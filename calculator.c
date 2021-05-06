#include<stdio.h>
void main()
{
    int a,b,ch;
    printf("Enter 2 no.: ");
    scanf("%d%d",&a,&b);
    printf("Enter choice-1.add 2.sub 3.mul 4.div 5.mod : ");
    scanf("%d", &ch);
    switch(ch)
    {
        case 1:
         printf("Addition is: %d", a+b);
         break;
        case 2:
         printf("Subtraction is: %d", a-b);
         break;
        case 3:
         printf("Multiplication is: %d", a*b);
         break;
        case 4:
         printf("Divition is: %d", a/b);
         break;
        case 5:
         printf("Quotient is: %d", a%b);
         break;
        default :
        printf("Choice isnt match");

    }
}