#include <stdio.h>
#include <stdlib.h>

struct treenode
{
    int data;
    struct treenode *left,*right;
};

struct q
{
    int data;
    struct q *next;
};

typedef struct q *no;

typedef struct treenode *node;

no head, tail,tm,nw;

node root,temp;

void create()
{
    int d;
    scanf("%d",&d);
    while(d)
    {
        nw=(no)malloc(sizeof(struct q));
        nw->data=d;
        nw->next=NULL;
        if(head==NULL)
        {
            head=nw;
            tail=head;
        }
        else
        {
            tail->next=nw;
            tail=nw;
        }
        scanf("%d",&d);
    }
}

void display()
{
    tm=head;
    while(tm!=NULL)
    {
        printf("%d ",tm->data);
        tm=tm->next;
    }
}

int main()
{
    create();
    display();
}