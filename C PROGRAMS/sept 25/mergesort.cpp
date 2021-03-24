
#include <iostream>

using namespace std;

int a[10000],temp[10000];

void merge(int left,int mid,int right)
{
	int i,le,size,tp;
	le=mid-1;
	tp=left;
	size=(right-left)+1;
	while(left<=le && mid<=right)
	{
		if(a[left]<=a[mid])
		{
			temp[tp]=a[left];
			tp++;
			left++;
		}
		else
		{
			temp[tp]=a[mid];
			tp++;
			mid++;
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
	if(left<right)
	{
		//cout<<"x";
		mid=(right+left)/2;
		mergesort(left,mid);
		mergesort(mid+1,right);
		merge(left,mid+1,right);
	}
}

int main() {
	int i=0;
	cin >> a[i];
	
	while(a[i])
	{
		i++;
		cin>>a[i];
	}

	mergesort(0,i-1);

	for(int j=0;j<i;j++)
	{
		cout<<a[j]<<" ";
	} 
}

