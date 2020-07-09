class Demo2{
	int id;
	void display(){
		System.out.println("Identity of class :"+id);
	}
}
	
class Print4{
	public static void main(String agrs[]){
		int id;
		Demo2 a = new Demo2();
		a.id=1234;
		id=4321;
		System.out.println("Identity:"+id);
		a.display();
	}
}