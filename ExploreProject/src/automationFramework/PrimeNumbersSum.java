package automationFramework;

public class PrimeNumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10,sum=0,c;
		for(int i=1;i<=n;i++){
			c=0;
			for(int j=2;j<=i/2;j++){
				
				if(i%j == 0){
					c++;
					break;
				}
			}
			if(c == 0 && i != 1){
				sum = sum + i;
			}
		}
		System.out.println("Sum is :"+sum);
	}

}
