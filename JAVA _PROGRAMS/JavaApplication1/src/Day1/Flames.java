package Day1;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Gui extends Frame{
	
}
public class Flames extends Gui implements Runnable{
	    Gui f1;
	    int counter = 0;
	    Flames(){
	    	f1 = new Gui();
	    	f1.setBounds(200,200,600,600);
	    	f1.setLayout(null);
	    	f1.setVisible(true);
	    }
		@Override
		public void run() {
		// TODO Auto-generated method stub
		Color[] a = {Color.orange,Color.RED,Color.WHITE,Color.CYAN,Color.gray};
		while(true) {
			f1.setBackground(a[counter]);
			counter++;
			if(counter==5) {
				counter = 0;
			}
			try {
				Thread.sleep(2000);	
			}
			catch (Exception e) {
				System.out.println(e);
			}
			
		}
		}
		
		public static void main(String[] args) {
			Flames f = new Flames();
			Thread t1 = new Thread(f);
			Button button;
		    Label lable1,lable2,lable3;
		    TextArea text1,text2;
			Font myfont = new Font("Serif", Font.BOLD, 20);
			button = new Button("Press Me");
			button.setSize(200,80);
			button.setLocation(150, 500);
			button.setBackground(Color.PINK);
			button.setFont(myfont);
			lable1 = new Label("Enter name of Person 1:");
			lable1.setFont(myfont);
			lable1.setBounds(20,20,300,100);
			lable2 = new Label("Enter name of Person 2:");
			lable2.setFont(myfont);
			lable2.setBounds(20,20,300,300);
			text1 = new TextArea("", 3 , 100 , TextArea.SCROLLBARS_NONE);;
			text1.setFont(myfont);
			text1.setBounds(330,40,250,50);
			text2 = new TextArea("", 3 , 100 , TextArea.SCROLLBARS_NONE);;
			text2.setFont(myfont);
			text2.setBounds(330,140,250,50);
			lable3 = new Label("");
			lable3.setFont(myfont);
		    lable3.setBounds(50,200,400,300);
			f.f1.add(lable1);
			f.f1.add(lable2);
			f.f1.add(lable3);
			f.f1.add(text1);
			f.f1.add(text2);
			f.f1.add(button);
			t1.start();
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					char[] s1 = text1.getText().toCharArray();
					char[] s2 = text2.getText().toCharArray();
					if(s1.length==0 || s2.length==0) {
						String s = "Enter Proper Name";
						String str = "";
						for(int i=0; i<s.length(); i++) {
							str+=s.charAt(i);
							try {
								lable3.setText(str);
								Thread.sleep(200);
							} catch (Exception e2) {
								// TODO: handle exception
							}
						}
					}
					else {
						int t = 0,index=0;
						for(int i=0; i<s1.length; i++) {
							for(int j = 0; j<s2.length; j++) {
								if(s1[i]==s2[j]) {
									t+=2;
									s2[j] = '1';
								}
							}
						}
						t = s1.length + s2.length - t;
						System.out.println(t);
						char[] fla = {'f','l','a','m','e','s'};
						int[] arr = {0,0,0,0,0,0};
						for(int i=0; i<6; i++) {
							int iter = 0;
							int j = 0;
							while(j<t) {
								if(arr[iter]==1) {
									while(arr[iter]==1) {
										iter++;
										if(iter==6)
										iter = 0;
									}
								}
								if(j==t-1 && i==5) {
									index = iter;
								}
								else if(j==t-1) {
									System.out.println(fla[iter]);
									arr[iter] = 1;
									j++;
								}
								j++;
								iter++;
								if(iter==6)
								iter = 0;
							}
						}
						switch(fla[index]) {
						case 'f':{
							String s = text1.getText()+" and "+text2.getText()+" is friends";
							String str = "";
							for(int i=0; i<s.length(); i++) {
								str+=s.charAt(i);
								try {
									lable3.setText(str);
									Thread.sleep(200);
								} catch (Exception e2) {
									// TODO: handle exception
								}
							}
							break;
						}
						case 'l':{
							String s = text1.getText()+" and "+text2.getText()+" is lovers";
							String str = "";
							for(int i=0; i<s.length(); i++) {
								str+=s.charAt(i);
								try {
									lable3.setText(str);
									Thread.sleep(200);
								} catch (Exception e2) {
									// TODO: handle exception
								}
							}
							break;
						}
						case 'a':{
							String s = text1.getText()+" and "+text2.getText()+" have affection";
							String str = "";
							for(int i=0; i<s.length(); i++) {
								str+=s.charAt(i);
								try {
									lable3.setText(str);
									Thread.sleep(200);
								} catch (Exception e2) {
									// TODO: handle exception
								}
							}
							break;
						}
						case 'm':{
							String s = text1.getText()+" and "+text2.getText()+" will marry";
							String str = "";
							for(int i=0; i<s.length(); i++) {
								str+=s.charAt(i);
								try {
									lable3.setText(str);
									Thread.sleep(200);
								} catch (Exception e2) {
									// TODO: handle exception
								}
							}
							break;
						}
						case 'e':{
							String s = text1.getText()+" and "+text2.getText()+" is enemy";
							String str = "";
							for(int i=0; i<s.length(); i++) {
								str+=s.charAt(i);
								try {
									lable3.setText(str);
									Thread.sleep(200);
								} catch (Exception e2) {
									// TODO: handle exception
								}
							}
							break;
						}
						case 's':{
							String s = text1.getText()+" "+text2.getText()+" is friends";
							String str = "";
							for(int i=0; i<s.length(); i++) {
								str+=s.charAt(i);
								try {
									lable3.setText(str);
									Thread.sleep(200);
								} catch (Exception e2) {
									// TODO: handle exception
								}
							}
							break;
						}
						}
					}
					
				}
			});
		}
}
