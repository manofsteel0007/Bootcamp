// Sample code to perform I/O:

#include <iostream>

using namespace std;

int main() {
	int t,n=0,temp;
	cin >>t;
	while(t>0)
	{
		cin>>n;
		int a[100];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		int l[100],p[100],x=0,c;
		
		for(int i=0;i<n;i++)
		{
			c=0;
			for(int j=0;j<x;j++)
			{
				if(l[n]==a[i])
				{
					c=1;	
				}
			}
			if(c==0)
			{
				x++;
				l[x]=a[i];
				p[x]=0;
				for(int j=i;j<n;j++)
				{
					if(a[j]==l[x])
					{
						p[x]++;
					}
				}
			}
		}
		for(int i=0;i<=x;i++)
		{
			for(int j=i+1;j<=x;j++)
			{
				if(p[i]<p[j])
				{
					temp=p[i];
					p[i]=p[j];
					p[j]=temp;
					temp=l[i];
					l[i]=l[j];
					l[j]=temp;
				}
			}
		}
		for(int i=0;i<=x;i++)
		{

			for(int j=0;j<p[i];j++)
			{
				cout<<l[i]<<" ";
			}
		}
		t--;
	}
}