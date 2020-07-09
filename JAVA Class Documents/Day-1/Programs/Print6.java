class Demo{
	int id;
	void display(){
		System.out.println(" Value : "+id);
	}
}

class Print6{
	public static void main(String aa[]){
	
		Demo d1 = new Demo(); 

		d1.id=100;
		d1.display();

		Demo d2 = new Demo(); 

		d2.id=200;
		d2.display();
	}
}