package Strings;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I LOVE INDIA";
		String words[] = s.split(" ");
		int length = words.length;
		String reverse[] = new String[length];
		System.out.println(length);
		for(int i=length-1;i>=0;i--){
			System.out.print(words[i]);
			System.out.print(" ");
		}
		

	}

}
