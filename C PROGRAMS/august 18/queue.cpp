#include <iostream>
# define max 100

using namespace std;

int arr[max],front=-1,rear=-2;

void display();

void inqueue(int x){
       if(front==-1){
              front=0;
              rear=0;
              arr[front]=x;
              cout<<arr[rear]<<" has been inqueued.\n";
              display();
       }
       else if(rear<max){
              rear++;
              arr[rear]=x;
              cout<<x<<" has been inqueued.\n";
              display();
       }
       else {
              cout<<"No space available";
       }
}

void dequeue(){
      if(front==rear){
             cout<<arr[front]<<" has been dequeued.\n";
             arr[front]=0;
             front=-1;
             rear=-2;
             display();
      } 
      else if (rear>0) {
             cout<<arr[front]<<" has been dequeued.\n";
             arr[front]=0;
             front++;
             display();
      }
      else{
             cout<<"No elements available";
      }
}

void display(){
       int temp=front;
       for(int i=temp;i<=rear;i++)
       {
              cout<<arr[i]<<"-> ";
       }
       cout<<"null"<<endl;
}

int main(){
       int opt,x;
       start:
       cout<<"Select the option:\n";
       cout<<"1.Inqueue\n";
       cout<<"2.Dequeue\n";
       cout<<"3.Display\n";
       cout<<"Enter the option according to the choice (1-3) :";
       cin>>opt;
       switch (opt)
       {
       case 1:
              cout<<"Enter the value:";
              cin>>x;
              inqueue(x);
              break;
       
       case 2:
              dequeue();
              break;

       case 3:
              display();
              break;

       default:
              cout<<"Enter valid option.";
              goto start;
              break;
       }
       char ch;
       cout<<"Enter 'y' to do again ";
       cin>>ch;
       if(ch=='y')
             goto start;
}