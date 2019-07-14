package aslanherseyburadaPACKAGE;

import java.util.*;

public class TestJava {
	public static void main(String args[]) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		// [hawk]
		birds.add("robin");
		// [hawk, robin]
		birds.add("blue jay");
		// [blue jay, hawk, robin]
		birds.add("cardinal");
		// [blue jay, cardinal, hawk, robin]
		System.out.println(birds);
		// [blue jay, cardinal, hawk, robin]
	}

}