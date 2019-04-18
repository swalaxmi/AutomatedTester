package automationFramework;

public class ArrayObjetcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] a = new Account[2];
		a[0] = new Account();
		a[1] = new Account();
		
		a[0].setData(2, 3);
		a[0].showData();
		
		a[1].setData(6, 8);
		a[1].showData();

	}

}
