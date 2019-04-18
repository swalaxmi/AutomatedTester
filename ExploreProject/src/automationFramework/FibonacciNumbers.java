package automationFramework;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0,c=1,number=6;
		for(int i=0;i<=number;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}

	}

}
