package networking;
import java.io.Serializable;

public class student implements Serializable {

    String fname="";
    String lname="";
    String email="";
    String rollno="";
    String password="";
    String college="";
    String phno="";
    String dept="";
    String sec="";

    public student(String fname,String lname,String email,String rollno, String password,String college,String phno,String dept,String sec){
        this.fname = fname; 
        this.lname = lname;
        this.email=email;
        this.rollno=rollno;
        this.password=password;
        this.college=college;
        this.phno=phno;
        this.dept=dept;
        this.sec=sec;
    }
}