package Project_biginner;

import java.util.HashSet;
import java.util.Set;

public class CommonCharMod {

	public static void main(String[] args) {
		/*
		getting three strings
		convert all of these into set
		compare and check for the common alphabet
		print
		*/
		
		String str1 = "abcde";
		String str2 = "asedf";
		String str3 = "acfdwebv";
		
		Set<Character> set1 = new HashSet<Character>();
		Set<Character> set2 = new HashSet<Character>();
		Set<Character> set3 = new HashSet<Character>();
		
		for (Character character : str1.toCharArray()) {
			set1.add(character);
		}
		for (Character character : str2.toCharArray()) {
			set2.add(character);
		}
		for (Character character : str3.toCharArray()) {
			set3.add(character);
		}
		
		set1.retainAll(set2);
		set1.retainAll(set3);
		System.out.println(set1);

	}

}
