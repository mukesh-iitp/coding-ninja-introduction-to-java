package tries;

public class TrieUse {
	public static void main(String[] args) {
		
		Trie t = new Trie();
		
		t.add("this");
		t.add("new");
		t.add("news");
		t.add("to");
		t.add("note");
		t.add("java");
		t.add("is");
		t.add("awsome");
		
		System.out.println(t.search("news"));
		
		t.remove("new");		
		System.out.println(t.search("new"));
		System.out.println(t.search("news"));
	}

}
