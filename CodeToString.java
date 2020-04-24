package assignment;

import java.util.*;


// class for decoding back to the string
// it gives back the string from code
public class CodeToString {
	private String code;

	public CodeToString(String code) {
		super();
		this.code = code;
	}

	String temp = "";
	String ans = "";

	public String getkey1() {
		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '0' && i == code.length() - 4) {
				Character cur = getchar(temp);
				ans += cur;
				StringBuilder ans1 = new StringBuilder(ans);

				return ans1.reverse().toString();

			}

			if (code.charAt(i) == '0') {
				Character cur = getchar(temp);
				ans += cur;
				i++;
				while (code.charAt(i) != '0') {
					i++;
				}
				temp = "";
			}

			temp += code.charAt(i);

		}

		StringBuilder ans1 = new StringBuilder(ans);

		return ans1.reverse().toString();

	}

	public String getkey() {

		boolean flag = false;
		for (int i = 0; i < code.length(); i++) {
			if (i > code.length()) {
				break;
			}

			if (i == (code.length() - 1)) {
				Character cur = getchar(temp);
				ans += cur;
				break;
			}

			if (i < code.length() - 1) {
				while (code.charAt(i) == '0' && i < code.length()) {
					i++;
					flag = true;
				}

			}

			if (flag == true) {
				Character cur = getchar(temp);
				temp = "";
				ans += cur;
				// System.out.println(ans);
				flag = false;

			}

			// System.out.println(temp);

		}

		StringBuilder ans1 = new StringBuilder(ans);

		return ans1.reverse().toString();

	}

	private Character getchar(String temp2) {
		StringToCode obj = new StringToCode("");
		TreeMap<Character, Integer> iMap = obj.toprimeHashMap;
		Integer prime = Integer.parseInt(temp2);
		// System.out.println("prime"+prime);

		for (Map.Entry<Character, Integer> it : iMap.entrySet()) {
			Integer curInteger = it.getValue();
			if (curInteger.equals(prime)) {
				// System.out.println(it.getValue()+prime);

				return it.getKey();
			}

		}

		return '\0';

	}

}
