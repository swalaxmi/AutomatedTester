package automationFramework;

public class Multiarray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multiarray = new int[3][3];
		multiarray[0][0] = 1;
		multiarray[1][1] = 2;
		multiarray[2][2] = 3;
		int length = multiarray.length;
		//System.out.println();
		for(int row=0; row<length; row++){
			for(int col=0; col<length; col++){
				System.out.println(multiarray[row][col]);
			}
			System.out.println("\n");
		}
	}

}
