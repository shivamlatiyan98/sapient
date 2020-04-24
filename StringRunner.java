package assignment;

public class StringRunner {

	public static void main(String[] args) {
		StringToCode code = new StringToCode("naveen");
		String ans = code.getCode();

		System.out.println("code for naveen : " + ans);

		StringToCode code2 = new StringToCode("shivamlatiyan");
		String ans2 = code2.getCode();

		System.out.println("code for shivamlatiyan : " + ans2);

		// code to string back
		// this is the another class which handles it

		CodeToString keyCodeToString0 = new CodeToString(ans);
		System.out.println("decoding the first code back to string");
		System.out.println(keyCodeToString0.getkey1());

		CodeToString keyCodeToString = new CodeToString(ans2);
		System.out.println("decoding the Second code back to string");
		System.out.println(keyCodeToString.getkey1());

		// code.assign();

	}

}
