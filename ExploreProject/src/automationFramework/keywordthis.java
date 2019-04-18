package automationFramework;

public class keywordthis {
	int a;
	int b;
	public void set(int a , int b){
		this.a=a;
		this.b=b;
	}
	public void show(){
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keywordthis k =new keywordthis();
		k.set(3, 4);
		k.show();

	}

}
