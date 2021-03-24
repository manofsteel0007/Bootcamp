#include <iostream>

using namespace std;

int main()
{
    int a[1000],i=0;
    cin>>a[0];
    while(a[i])
    {
        i++;
        cin>>a[i];
    }
    int n=i;
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
}