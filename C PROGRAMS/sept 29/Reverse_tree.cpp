#include <bits/stdc++.h> 
using namespace std; 
  
struct node { 
    char key; 
    node* left; 
    node* right; 
}; 

struct node* create(char value)
{
    node* n =new node;
    n->key=value;
    n->left=NULL;
    n->right=NULL;
    //cout<<n->key;
    return n;
}
//1 2 3 N N 4 6 N 5 N N 7 N
struct node* insertvalue(struct node* root,char c,queue <node*>& q)
{

    node* newnode=create(c);
    if(root==NULL)
    {
        root=newnode;
    }
    else if(q.front()->left==NULL)
    {
        q.front()->left=newnode;
    }
    else
    {
        q.front()->right=newnode;
        q.pop();
    }
    if(c!='N')
    {
        q.push(newnode);
    }
    return root;
}

void print_tree(node* root)
{
    if(root==NULL)
    {
        return;
    }
    print_tree(root->left);
    if(root->key!='N')
        cout<<root->key<<" ";
    print_tree(root->right);
}

int main()
{
    char n[10000];
    int i=0;
    gets(n);

    node* root=NULL;
    queue <node*> q;
    //cout<<strlen(n)<<endl;
    while(i<strlen(n))
    {
        root=insertvalue(root,n[i],q);
        //cout<<n[i]<<endl;
        i=i+2;
    }
    print_tree(root);
}