
// Sample code to perform I/O:

#include <iostream>

using namespace std;
int a[10000],sum=0;

void pp(int x,int y)
{
	int l_sum=0;
	for(int i=x;i<=y;i++)
	{
		l_sum+=a[i];
	}
	//cout<<l_sum<<endl;
	if(l_sum>sum)
	{
		sum=l_sum;
	}
}

void p(int left,int right)
{
	int mid;
	if(right>left)
	{
		mid=(left+right)/2;
		p(left,	mid);
		//cout<<"a";
		p(mid+1, right);
		//cout<<"b";
		pp(left,right);
	}
}

int main() {
	int n,i=0,l_sum=0;
	cin>>n;
	cin>>a[i];
	while(a[i])
	{
		i++;
		cin>>a[i];
	}
	for(i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			l_sum=0;
			for(int z=i;z<=j;z++)
			{
				l_sum+=a[z];
			}
			if(sum<l_sum)
			{
				sum=l_sum;
			}
		}
	}
	cout<<endl<<sum;
	/*
	for(int j=0;j<i;j++)
	{
		cout<<a[j]<<" ";
	}*/
}

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail


// Write your code here
