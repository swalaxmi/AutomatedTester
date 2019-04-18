package automationFramework;

public class Democlass extends ConstructorChaining{
	
	int value3;
	int value4;
	
	Democlass(){
		super();
		value3 = 60;
		value4 = 70;
		System.out.println("child class constructor");
	}
	
	public void display(){
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

	}
	
}
