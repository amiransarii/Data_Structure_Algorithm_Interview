package org7.ninja.recursion2;

public class Test6ReturnKeypad_Me {
	public static String[] keypad(int n) {
		int k = 0;

		if (n == 0 || n == 1) {
			String[] str = { "" };
			return str;
		}

		String[] smallresult = keypad(n / 10);
		String code = getcode(n % 10);
		String[] result = new String[smallresult.length * code.length()];

		for (int i = 0; i < smallresult.length; i++) {
			for (int j = 0; j < code.length(); j++) {
				result[k++] = smallresult[i] + code.charAt(j);
			}
		}
		return result;
	}

	public static String getcode(int num) {
		switch (num) {
		case 1:
			return "";
		case 2:
			return "abc";
		case 3:
			return "def";
		case 4:
			return "ghi";
		case 5:
			return "jkl";
		case 6:
			return "mno";
		case 7:
			return "pqrs";
		case 8:
			return "tuv";
		case 9:
			return "wxyz";
		}
		return "";
	}
}
