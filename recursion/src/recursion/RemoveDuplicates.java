package recursion;

public class RemoveDuplicates {
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here

		if(s.length() <= 1){
			return s;
		}

		String ans = "";
		if(s.charAt(0)!=s.charAt(1))
			ans = ans + s.charAt(0);
		
		String smallAns = removeConsecutiveDuplicates(s.substring(1));
		
		return ans + smallAns;

	}
	
	public static void main(String[] args) {
    	String input = "aaabbbssdbsdf";
    	System.out.println(RemoveDuplicates.removeConsecutiveDuplicates(input));
    }
}

