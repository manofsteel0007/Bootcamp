class Demo{
	int id;
	void display(){
		System.out.println(" Class Test "+id);
	}
}
class Print5{
	public static void main(String agrs[]){
		Demo d1 = new Demo();
		d1.id=4321;
		d1.display();
		d1.display();
		d1.display();
		new Demo().id=1234; 
		new Demo().display();
		new Demo().display();
		new Demo().display();
	}
}