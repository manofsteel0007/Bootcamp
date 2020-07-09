import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class NotesApp {
    ArrayList<String>arrayList = new ArrayList<>();
    int height = 100;
    JFrame lay = new JFrame("Notes APP");
    NotesApp(){
        JLabel head = new JLabel("NOTES APP");
        JTextField area = new JTextField();
        JButton button = new JButton("Save Notes");
        button.setBackground(Color.GREEN);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveToNotes(area);
                    area.setText(" ");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        button.setBounds(370,100,100,30);
        area.setBounds(50,100,300,30);
        head.setBounds(200,-100,100,300);
        this.lay.add(head);
        this.lay.add(button);
        this.lay.add(area);
        this.lay.setSize(500,500);
        this.lay.getContentPane().setBackground(Color.white);
        this.lay.setLayout(null);
        this.lay.setVisible(true);
    }
    public void saveToNotes(JTextField area)throws IOException {
        String notes =area.getText();
        FileOutputStream data = new FileOutputStream("D:\\Notes.txt",true);
        byte b[] = notes.getBytes();
        String lineSeparator = System.getProperty("line.separator");
        byte c[] = lineSeparator.getBytes();
        data.write(b);
        data.write(c);
        data.close();
        readNotes();
    }
    public  void readNotes() throws IOException {
        FileReader file = new FileReader("D:\\Notes.txt");
        BufferedReader buff = new BufferedReader(file);
        String line;

        while((line=buff.readLine())!= null){
            if(arrayList.contains(line) == false){
                arrayList.add(line);
                diplayTheLabel(line);
            }
            else{
                continue;
            }

        }
    }
    public void diplayTheLabel(String line){
        height = this.height+30;
        JLabel lab = new JLabel();
        lab.setText(line);
        lab.setBounds(50,height,300,30);
        this.lay.add(lab);

    }
    public static void main(String[] args) {
        new NotesApp();
    }
}
