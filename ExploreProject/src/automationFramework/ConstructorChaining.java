package automationFramework;

public class ConstructorChaining {
	int value1;
	int value2;
	ConstructorChaining(){
		value1 = 10;
		value2 = 20;
		System.out.println("Parent Constructor");
	}
	ConstructorChaining(int a){
		value1 =  a;
		System.out.println("second constructor");
	}
	public void display(){
		System.out.println(value1);
		System.out.println(value2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Democlass d = new Democlass();
		d.display();
		

	}

}
