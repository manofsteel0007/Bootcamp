/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class linkednode
{
    String data1;
    linkednode next;
}

class liscreate
{
    int count=0;
    linkednode head,tail,temp,newnode;
    Scanner s = new Scanner(System.in);
    void input(){
        
        newnode=new linkednode();
        try
        {
            newnode.data1=s.next();
        }
        catch(Exception e)
        {
            return;
        }
        push();
        count++;
        input();
        return;
    }

    void push()
    {
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    void x()
    {
        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data1+" ");
            temp=temp.next;
        }
    }
    void display(linkednode obj)
    {
        if(obj.next==null)
        {
            System.out.print(obj.data1+" ");
            return;
        }
        display(obj.next);
        System.out.print(obj.data1+" ");
        return;
    }
}

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        liscreate s1=new liscreate();
        s1.input();
        //s1.x();
        //System.out.print(s1.count);
        s1.display(s1.head);
    }
}
