package Strings;

public class BuilderStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder bu = new StringBuilder("ZenQ");
		//bu.append("Limited");
		//bu.insert(3,"Assurnace");
		//bu.replace(2, 4, "Hello");
		bu.delete(1, 2);
		System.out.println(bu);

	}

}
