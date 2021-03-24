
// Sample code to perform I/O:
#include <stdio.h>

struct cir
{
	int data;
	struct cir *next;	
};

typedef struct cir *node;

node head,tail,newnode,temp,temp1,x,y;

int n;

void create()
{
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		newnode=(node)malloc(sizeof(struct cir));
		scanf("%d",&newnode->data);
		if(head==NULL)
		{
			head=newnode;
			head->next=head;
			tail=head;
		}
		else
		{
			tail->next=newnode;
			newnode->next=head;
			tail=newnode;
		}
	}
}

void prime()
{
	temp=head;
	while(temp->next!=head)
	{
		int count=0;
		for(int i=2;i<=temp->data;i++)
		{
			if(temp->data%i==0)
			{
				count++;
			}
			else if(temp->data==1)
			{
				count=2;
				break;
			}
		}
		if(count>1)
		{
			if(x==NULL)
			{
				newnode=(node)malloc(sizeof(node));
				newnode->data=temp->data;
				newnode->next=NULL;
				x=newnode;
				y=x;
			}
			else
			{
				newnode=(node)malloc(sizeof(node));
				newnode->data=temp->data;
				newnode->next=NULL;
				y->next=newnode;
				y=newnode;
			}
			//printf("%d ",temp->data);
			/*temp1=head;
			while(temp1->next!=temp)
			{
				temp1=temp1->next;
			}
			temp1->next=temp->next;*/
		}
		temp=temp->next;
	}
	int count=0;
	for(int i=2;i<=temp->data;i++)
	{
		if(temp->data%i==0)
		{
			count++;
		}
		else if(temp->data==1)
		{
			count=2;
			break;
		}
	}
	if(count>1)
	{
		if(x==NULL)
		{
			newnode=(node)malloc(sizeof(node));
			newnode->data=temp->data;
			newnode->next=NULL;
			x=newnode;
			y=x;
		}
		else
		{
			newnode=(node)malloc(sizeof(node));
			newnode->data=temp->data;
			newnode->next=NULL;
			y->next=newnode;
			y=newnode;
			//printf("%d ",temp->data);
		}
		//printf("%d ",temp->data);
		/*temp1=head;
		while(temp1->next!=temp)
		{
			temp1=temp1->next;
		}
		temp1->next=temp->next;*/
	}	
}

void display(node p)
{
/*	temp=x;
	while(temp!=NULL)
	{
		printf("%d ",temp->data);
		temp=temp->next;
	}
*/
	if(p==NULL)
	{
		return;
	}
	
	display(p->next);
	printf("%d ",p->data);
/*	do{
		temp=x;
		temp1=NULL;
		while(temp->next!=temp1)
		{	
			temp=temp->next;
		}
		printf("%d ",temp->data);
		temp1=temp;
	}while(temp==x);
	printf("%d ",temp->data);
*/
}

int main(){
	create();
	prime();
	display(x);
}

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail


// Write your code here
