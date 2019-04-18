package Strings;

public class UniqueNumbersStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "PRESENTATION";
		int length = word.length();
		for(int i=0; i<length; i++){
			int k=0;
			for (int j=i+1;j<length;j++){
				if(word.charAt(i) == word.charAt(j)){
					k++;
				}
			}
			if(k<1){
				System.out.print("Unique Number is:"+word.charAt(i));
			}
			k=0;
		}

	}

}
