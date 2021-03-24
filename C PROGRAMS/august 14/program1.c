#include <stdio.h>

void decimal(int x){
    int a[100]={0};
    int temp=x,rem,p=0;
    
    while(temp)
    {
        rem=temp%2;
        a[p]=rem;
        temp=temp/2;
        p++;
    }
    printf("\nBinary=");
    for(int i=p-1;i>=0;i-- )
    {
        printf("%d",a[i]);
    }

    temp=x;

   for(int i=p-1;i>=0;i--)
   {
     int z=0;
      printf("%d",a[i]);     
   }
}

void octal_binary(int x){
    int b[100]={0};
    int temp=x,rem,p=0,z;
    
    while(temp)
    {
        rem=temp%10;
        z=2;
        while(rem){
            b[p+z]=rem%2;
            rem=rem/2;
          z--;
        }
        p+2;
        temp=temp/10;
    }
    printf("\nOctal to Binary=");
    for(int i=p-1;i>=0;i-- )
    {
        printf("%d",b[i]);
    }
}

int main(){
  clrscr();
    int a=257;
    octal_binary(a);
    printf("%d",a);
  return 0;
}