/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author kumar
 */
public class server_socket{
    final int port=8089;
    private ServerSocket s=null;
    void runServer()
    {
        try 
        {
            s=new ServerSocket(port);
            System.out.println("waiting");
            Socket socket=s.accept();
            ObjectInputStream oi=new ObjectInputStream(socket.getInputStream());
            student xyz=(student)oi.readObject();
            //System.out.println(xyz.fname+" "+xyz.lname+" "+xyz.email+" "+xyz.phno);
            new database().writedb(xyz);
            socket.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new server_socket().runServer();
    }
}
