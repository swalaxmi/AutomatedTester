package automationFramework;

public class ArraysExamples {
	
	public static void firstMethod(String a[]){
		a[0]="swathi";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] b = new String[3];
		b[0]="one";
		b[1]="two";
		System.out.println(b[0]);
		firstMethod(b);
		System.out.println(b[0]);

	}

}

	
	
