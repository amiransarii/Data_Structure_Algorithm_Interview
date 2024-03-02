package org5.ninja.hashmaps;

import java.util.*;

public class Test_9_Make_Strings_Anagram_Me {
	public static int makeAnagram(String s1, String s2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		int n = s1.length();
		for (int i = 0; i < n; i++) {
			char ch = s1.charAt(i);
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}

		n = s2.length();
		int deletion = 0;
		for (int i = 0; i < n; i++) {
			char ch = s2.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) - 1);
				if (map.get(ch) == 0)
					map.remove(ch);
			} else {
				deletion++;
			}
		}

		for (int freq : map.values()) {
			deletion += freq;
		}
		return deletion;

	}

}
