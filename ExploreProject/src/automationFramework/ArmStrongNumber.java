package automationFramework;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,sum=0, temp;
		temp=n;
		int numberlength = String.valueOf(n).length();
		System.out.println("length is:"+ numberlength);
		while(temp !=0){
			int lastdigit = temp%10;
			int lastdigitpower = 1;
			for(int i=0;i<numberlength;i++){
				lastdigitpower = lastdigitpower*lastdigit;
			}
			sum = sum+lastdigitpower;
			temp = temp/10;
		}
		if (sum == n){
			System.out.println("Given number "+n+" is ArmStrong Number");
		}
		else{
			System.out.println("Given number is not ArmStrong Number");
		}

	}

}
