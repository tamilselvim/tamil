#include<stdio.h>
#include<conio.h>
int main(){
double n1,n2,n3;
printf("enter three number");
scanf("%1f %1f %1f",&n1,&n2,&n3);
if(n1>=n2&&n1>=n3)
printf("2f is greatest number ",n1);
if(n2>=n1&&n2>=n3)
printf("2f is greatest number",n2);
if(n3>=n1&&n3>=n2)
printf("2f is greatest number",n3);
return 0;
}
