class Demo{
	int x;
	void display(){
		
		System.out.println("x="+x);
	}
}

class Print1{
	public static void main(String ags[]){
		Demo a= new Demo();
		a.x=100;
		a.display();
	}
}