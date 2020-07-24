#include <iostream>

using namespace std;

int main()
{
       int n,i,j,c=0;
       cin>>n;
       char a[n],b[n];
       cin>>a>>b;
       for(i=0;i<n;i++)
       {
              for(j=0;j<n;j++)
              {
                     if(b[j]=='.')
                            continue;
                     if(a[i]==b[j])
                     {
                            c++;
                            b[j]='.';
                            break;
                     }                     
              }
              if(j==n)
              {
                     break;
              }
       }
}