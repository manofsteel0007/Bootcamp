
// Sample code to perform I/O:

#include <iostream>

using namespace std;

int main() {
	int t,n,temp;
	cin >>t;	
	while(t>0)
	{
		cin>>n;
		int a[1000];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int x=0,p[1000];
		for(int i=0;i<n/2;i++)
		{
			p[i]=a[x];
			x++;
			p[n-1-i]=a[x];
			x++;
		}
		if(n%2!=0){
			a[(n/2)+1]=a[x];
		}
		for(int i=0;i<n;i++)
		{
			cout<<p[i]<<" ";
		}
		t--;
	}
}



// Write your code here
