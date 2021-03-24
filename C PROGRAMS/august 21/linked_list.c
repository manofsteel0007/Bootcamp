#include <stdio.h>

struct linkednode
{
       int data;
       struct linkednode *next;
       struct linkednode *previous;
       
};
typedef struct linkednode *node;

node head,temp;
//head=(node)malloc(sizeof(node));

int insertion(){

       int x,opt;
       node new_node=(node) malloc(sizeof(node));
       scanf("Enter the value%d",&x);
       new_node->data=x;
       new_node->next=NULL;
              
       if(head==NULL)
       {
              head=new_node;
              printf("data has been inserted");
              return 0;
       }
       
       scanf("1.at begin\n2.at end%d",&opt);
       if(opt==1)
       {
              new_node->next=head;
              head=new_node;
       }      
       else
       {
              temp=head;
              while (temp->next!=NULL)
              {
              }
              temp->next=new_node;
       }
       printf("data has been inserted");
       return 0;       
}

int deletion(){
       int x,opt;
       scanf("1.at begin\n2.at end%d",&opt);
       if(opt==1)
       {
              temp=head;
              head=head->next;
              free(temp);
       }      
       else
       {
              temp=head;
              while (temp->next->next!=NULL)
              {
              }
              free(temp->next->next);
              temp->next=NULL;
       }
       return 0;
}

void display(){
       temp=head;
       while(temp!=NULL)
       {
              printf("%d-> ",temp->data);
              temp=temp->next;
       } 
}

int main()
{
       int opt;
       scanf("1.Insertion\n2.Deletion\nEnter the option:%d",&opt);
       if(opt==1)
       {
              insertion();
              printf("\n");
              display();
       }
       else
       {
              deletion();
              printf("\n");
              display();
       }
       return 0;
}