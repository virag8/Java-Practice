package programs;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MatchingPair {
	static List<Chars> lstChars = new ArrayList<Chars>();
	static HashMap<String, Integer> matchPattern = new HashMap<String, Integer>();
	static int patternMatchIndex = 0;
	static String balanced = "No";
	static String output = "Balanced: %s; MatchingPairs: %s";
	static boolean breakCode = false;

	private static void reset() {
		lstChars = new ArrayList<Chars>();
		matchPattern = new HashMap<String, Integer>();
		patternMatchIndex = 0;
		balanced = "No";
		output = "Balanced: %s; MatchingPairs: %s";
		breakCode = false;

		lstChars.add(new Chars('[', ']'));
		lstChars.add(new Chars('{', '}'));
		lstChars.add(new Chars('(', ')'));
		lstChars.add(new Chars('<', '>'));
	}

	private static String readfile(String fileName) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String content = scanner.useDelimiter("\\A").next();
		scanner.close();
		return content;
	}

	public static void main(String[] args) throws IOException, URISyntaxException {
		String textToParse = "({{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>text_with.spaces<{[here]}>{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>[][][]{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>text_with.spaces<{[here]}>{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>engx<coding>(challenge)is[fun]{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>text_with.spaces<{[here]}>{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}({{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>text_with.spaces<{[here]}>{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>[][][]{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>text_with.spaces<{[here]}>{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>engx<coding>(challenge)is[fun]{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>text_with.spaces<{[here]}>{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>})><><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>text_with.spaces<{[here]}>{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>[][][]{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>text_with.spaces<{[here]}>{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>engx<coding>(challenge)is[fun]{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()}>text_with.spaces<{[here]}>{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}<some[random]<text>(here)><>({{(<>[some[random]<text>])}<[some[random]<text>]{}()>})<{{(<>[some[random]<text>])}<[some[random]<text>]{}()>}>{([random]<text>)}{{(<>[some[random]<text>])}<[some[random]<text>]{}()>})";

		String[] input = { "]yet(another)", "{hello<world]}", "<and>yet(another[one)" };
		String fileName = "C:\\Users\\virag_kumar\\Downloads\\inputString.txt";

		String content = readfile(fileName);
		reset();
		// System.out.println(string);
		CheckJSONPattern(content);

	}

	public static void CheckJSONPattern(String input) {
		for (int index = 0; index < input.length(); index++) {
			char c = input.charAt(index);
			found(c);
			if (breakCode)
				break;
		}
		if (!matchPattern.isEmpty())
			balanced = "No";
		System.out.println(String.format(output, balanced, patternMatchIndex));
	}

	public static void found(char c) {
		for (Chars chars : lstChars) {
			String startChar = String.valueOf(chars.startChar);
			if (chars.startChar == c) {
				if (matchPattern.containsKey(startChar)) {
					Integer val = matchPattern.get(startChar);
					matchPattern.put(String.valueOf(c), ++val);
				} else {
					matchPattern.put(String.valueOf(c), 1);
				}
				break;
			}
			if (chars.endChar == c) {
				if (!matchPattern.containsKey(startChar)) {
					System.err.println(chars.endChar + " found before start char");
					breakCode = true;
					break;
				}
				patternMatchIndex++;
				Integer val = matchPattern.get(startChar);
				if (val == 1)
					matchPattern.remove(startChar);
				else
					matchPattern.put(startChar, val--);
				break;
			}
		}
	}
}

class Chars {
	char startChar;
	char endChar;

	public Chars(char startChar, char endChar) {
		super();
		this.startChar = startChar;
		this.endChar = endChar;
	}

}
