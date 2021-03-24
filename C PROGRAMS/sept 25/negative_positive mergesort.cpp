
// Sample code to perform I/O:

#include <iostream>

using namespace std;

int a[10000],temp[100000];

void merge(int left,int mid,int right)
{
	int i,le,size,tp;
	le=mid-1;
	tp=left;
	size=(right-left)+1;
	while(left<=le && mid<=right)
	{
		if(a[left]<0)
		{
			temp[tp]=a[left];
			tp++;
			left++;
		}
		else if(a[mid]<0)
		{
			
			temp[tp]=a[mid];
			tp++;
			mid++;
		}
		else if(a[mid]>0)
		{
			temp[tp]=a[left];
			tp++;
			left++;
		}
	}
	while(left<=le)
	{
		temp[tp]=a[left];
		tp++;
		left++;
	}
	while(mid<=right)
	{
		temp[tp]=a[mid];
		tp++;
		mid++;
	}
	for(i=0;i<size;i++)
	{
		a[right]=temp[right];
		right=right-1;
	}
}

void mergesort(int left,int right)
{
	int mid;
	if(right>left)
	{
		mid=(left+right)/2;
		mergesort(left,mid);
		mergesort(mid+1,right);
		merge(left,mid+1,right);
	}
}

int main() {
	int n;
	cin >> n;
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	mergesort(0,n-1);
	for(int i=0;i<n;i++)
	{
		cout<<a[i]<<" ";
	}
}
