package strings;

public class WordCount {
	
	public static int wordCount(String str) {
		
		int total=1;
		
		for (int i = 0; i < str.length(); i++) {
	         // checking if current character is space or not
	         if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
	            total++; // incrementing the word count 
	         }
	      }
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Programming";
		
		System.out.println("Word Count = "+wordCount(str));

	}

}
