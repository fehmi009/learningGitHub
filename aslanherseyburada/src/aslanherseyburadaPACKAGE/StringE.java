package aslanherseyburadaPACKAGE;

public class StringE {
	public static void main(String[] args) {
		System.out.println(StringE.stringE("Heelele"));
	}
	public static boolean stringE(String str) {
		int count = 0;
		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == 'e') count++;
		    // alternately: str.substring(i, i+1).equals("e")
		  }

		  return (count >= 1 && count <= 3);
}
}

	
