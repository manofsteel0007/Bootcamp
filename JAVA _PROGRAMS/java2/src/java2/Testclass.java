
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class tree
{
    int data,h;
    tree right,left;
    tree(int data)
    {
        this.data=data;
        h=1;
        right=null;
        left=null;
    }
}

class TestClass {

    tree mainroot,delroot;

    int he(tree root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.h;
    }

    int greater(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    int balance(tree root)
    {
        if(root==null)
        {
            return 0;
        }
        return he(root.left)-he(root.right);
    }

    tree r(tree a)
    {
        tree b=a.left;
        tree c=b.right;

        a.left=c;
        b.right=a;

        a.h=greater(he(a.left),he(a.right))+1;
        b.h=greater(he(b.left),he(b.right))+1;

        return b;
    }

    tree l(tree a)
    {
        tree b=a.right;
        tree c=b.left;

        a.right=c;
        b.left=a;

        a.h=greater(he(a.left),he(a.right))+1;
        b.h=greater(he(b.left),he(b.right))+1;

        return b;
    }

    tree create(tree root,int data)
    {
        if(root==null)
        {
            return new tree(data);
        }
        else if(data<root.data)
        {
            root.left=create(root.left,data);
        }
        else if (data>root.data)
        {
            root.right=create(root.right,data);
        }
        else
        {
            return root;
        }

        root.h=greater(he(root.left), he(root.right))+1;

        int bal=balance(root);

        if(bal>1 && data<root.left.data)
        {
            root=r(root);
            return root;
        }

        if(bal<-1 && data>root.right.data)
        {
            root=l(root);
            return root;
        }
        if(bal>1 && data>root.left.data)
        {
            root.left=l(root.left);
            root=r(root);
            return root;
        }
        if(bal<-1 && data<root.right.data)
        {
            root.right=r(root.right);
            root=l(root);
            return root;
        }
        return root;
    }

    tree d(tree root,int x)
    {
        if(root==null)
        {
            return null;
        }
        int f=0;
        while(f==0)
        {
            if(root.data==x)
            {
                delroot=root;
                root=null;
                f=1;
            }
            else if(root.data>x)
            {
                root=root.left;
            }
            else
            {
                root=root.right;
            }
        }
        return delroot;
    }



    void pp(LinkedList val1,tree root)
    {
        if(root==null)
        {
            return;
        }
        pp(val,root.left);
        pp(val,root.right);
        val1.add(root.data);
        return;
    }

    LinkedList<Integer> val;

    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);

        TestClass z=new TestClass();
        int type=s.nextInt();
        int size=s.nextInt();
        for(int i=0;i<size;i++)
        {
            int key=s.nextInt();
            z.mainroot=z.create(z.mainroot, key);
        }
        if(type==1)
        {
            z.inorder(z.mainroot);
            System.out.println();
            z.pre(z.mainroot);
            System.out.println();
            z.post(z.mainroot);
            System.out.println();
        }
        if(type==2)
        {
            int del=s.nextInt();
            z.delroot=z.d(z.mainroot, del);
            z.val=new LinkedList<Integer>();

            z.pp(z.val,z.delroot);
        }
    }
    void inorder(tree root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void pre(tree root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        pre(root.left);
        pre(root.right);
    }

    void post(tree root)
    {
        if(root==null)
        {
            return ;
        }
        post(root.left);
        post(root.right);
        System.out.print(root.data+" ");
    }
}
