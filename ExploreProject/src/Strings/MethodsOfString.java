package Strings;

public class MethodsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SeleniumJava";
		System.out.println(s.charAt(8));
		int stringlength = s.length();
		System.out.println("String length: "+stringlength);
		String substring = s.substring(8,12);
		System.out.println("sub string is:"+substring);
		boolean contain = s.contains("Java");
		System.out.println(contain);
		boolean equals = s.equals("SeleniumJava");
		System.out.println(equals);
		String s1 = " TestNG Cucucmber ";
		System.out.println(s.isEmpty());
		System.out.println(s.concat(s1));
		String s2 = s1.replace(s1,"Maven");
		System.out.println(s2);
		System.out.println(s2.replace('M','C'));
		System.out.println(s1.indexOf("NG"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s.indexOf('e',2));
		System.out.println(s1.trim());
		boolean ignorecase = s.equals("SeLeniumJAVA");
		System.out.println(ignorecase);
		
		
		
		
		
		
		
		
		
		
		
	}

}
