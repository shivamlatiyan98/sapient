package assignment;

import java.util.*;

public class StringToCode {
	StringBuilder keyString;
	TreeMap<Character, Integer> toprimeHashMap;

	public StringToCode(String code) {
		super();
		this.keyString = new StringBuilder(code);
		this.toprimeHashMap = new TreeMap<Character, Integer>();
		assign();
	}

	public void assign() {
		String str = "abcdefghijklmnopqrstuvwxyz";
		List<Integer> primeList = generatePrimeno();
		Vector<Integer> primeVector = new Vector<Integer>(primeList);

		// System.out.println(primeVector);

		int i = 0;
		Iterator<Integer> priIterator = primeVector.iterator();

		for (Character ch : str.toCharArray()) {
			if (priIterator.hasNext())
				toprimeHashMap.put(ch, priIterator.next());

		}

	}

	// prime no used for encryption in the code
	private List<Integer> generatePrimeno() {
		List<Integer> primenos = List.of(1511, 1523, 1531, 1543, 1549, 1553, 1559, 1567, 1571, 1579, 1583, 1597, 1611,
				1677, 1639, 1613, 1619, 1621, 1627, 1637, 1657, 1663, 1667, 1669, 1913, 1931);

		return primenos;
	}

	public String codetoString(Integer code) {

		return null;

	}

	public String getCode() {
		StringBuilder curString = this.keyString.reverse();
		String curString2 = curString.toString();
		int k = curString2.length();
		String anString = "";

		for (Character ch : curString2.toCharArray()) {
			Integer d = toprimeHashMap.get(ch);
			String refString = codetemplate(k);
			anString = anString + d.toString() + refString;
			k--;
		}

		return anString;

	}

	private String codetemplate(int k) {
		String anString = "0";
		Random r = new Random();
		Integer cur = r.nextInt(100);
		if (cur == 0 || cur % 10 == 0) {
			cur = k;
		}
		String temp = cur.toString();

//	for(int j=0;j<k;j++) {
//		
//		anString+="0";
//	}

		return anString + temp + "0";
	}

}
