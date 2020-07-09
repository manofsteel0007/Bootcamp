class Demo{
	static int id=0;
	static void display(){
		System.out.println("ID of the person :"+id);
	}
}

class Print3{
	public static void main(String agrs[]){
		System.out.println("Program-3\n");
		Demo.id=12345;
		Demo.display();
	}
}