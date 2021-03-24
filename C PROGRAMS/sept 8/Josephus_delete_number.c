
// Sample code to perform I/O:
#include <stdio.h>

struct cir
{
	int data;
	struct cir *next,*pre;
};

typedef struct cir *node;

node head,tail,newnode,temp,temp1,temp2;

int n,m;

void create()
{
	scanf("%d %d",&n,&m);
	for(int i=1;i<=n;i++)
	{
		newnode =(node)malloc(sizeof(struct cir));
		newnode->data=i;
		if(head==NULL)
		{
			head=newnode;
			head->next=head;
			head->pre=head;
			tail=head;
		}
		else
		{
			newnode->next=head;
			head->pre=newnode;
			tail->next=newnode;
			newnode->pre=tail;
			tail=newnode;
		}
	}
}

void execution()
{
	temp=head;
	while(temp->next!=temp)
	{
		for(int i=0;i<m-1;i++)
		{
			temp=temp->next;
		}
		temp1=temp->pre;
		temp2=temp->next;
		temp1->next=temp2;
		temp2->pre=temp1;
		free(temp);
		temp=temp2;
	}
	printf("%d",temp->data);
}

int main(){
	create();
	execution();
}

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail


// Write your code here
