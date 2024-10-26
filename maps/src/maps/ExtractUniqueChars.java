package maps;

import java.util.HashMap;

public class ExtractUniqueChars {

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		HashMap<Character, Integer> map = new HashMap<>();
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!map.containsKey(ch)) {
				s = s + ch;
				map.put(ch, 1);
			}
		}
		return s;

	}
	public static void main(String[] args) {
		
		String str="ababacd";
		System.out.println(uniqueChar(str));
	}

}
