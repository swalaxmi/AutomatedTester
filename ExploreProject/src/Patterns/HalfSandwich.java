package Patterns;

public class HalfSandwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		for (int i=1;i<=n;i++){
			for(int s=n-i;s>0;s--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		for(int k=n;k>=1;k--){
			for(int m=n-k;m>0;m--){
				System.out.print(" ");
			}
			for(int p=k;p>=1;p--){
				System.out.print("*");
			}
			System.out.println("");
		}
				
				

	}

}
