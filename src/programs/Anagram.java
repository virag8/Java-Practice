package programs;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String word1 = "word";
		String word2 = "wodr";
		System.out.println(check(word1, word2));
	}

	private static Boolean check(String orgWord, String anaWord) {
		Boolean found = false;
		if (orgWord.length() != anaWord.length() || orgWord.equals(anaWord))
			return false;

		if (SortString(orgWord).equals(SortString(anaWord)))
			return true;

		return false;
	}

	private static String SortString(String word) {
		char[] sortWord = word.toCharArray();
		Arrays.sort(sortWord);
		System.out.println(new String(sortWord));
		return new String(sortWord);
	}
}
