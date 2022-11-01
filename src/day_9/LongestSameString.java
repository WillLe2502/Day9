package day_9;

public class LongestSameString {

	public static void main(String[] args) {
		String[] strs1 = { "flower", "alow", "flight" };
		String[] strs2 = { "dog", "racecar", "car" };

		System.out.println("longestSameString(strs1): ");
		System.out.println(longestSameString(strs1));
		System.out.println();
		System.out.println("findLongestCommonPrefix(strs1): ");
		System.out.println(findLongestCommonPrefix(strs1));
		System.out.println();
		System.out.println("LongestSameString2(strs1): ");
		System.out.println(LongestSameString2(strs1));

	}

	public static String longestSameString(String[] strings) {
		int commonPrefix = strings[0].length();
		int maxSameString = 0;
		int counter = 0;

		for (int i = 1; i < strings.length; i++) {
			counter = 0;
			//System.out.println("i: " + i);
			while (counter < strings[i].length() 
					&& counter < commonPrefix
					&& strings[i].charAt(counter) == strings[0].charAt(counter)) {
				
				counter++;
				
			}
			// --
			commonPrefix = counter;
		}

		return strings[0].substring(0, maxSameString);
	}

	public static String LongestSameString2(String[] strs) { // time complexity O(n*m), m is length of strs[0]

		int max = strs[0].length();
		int count = 0;

		for (int i = 1; i < strs.length; i++) {
			count = 0;
			while (count < strs[i].length() && count < max && strs[i].charAt(count) == strs[0].charAt(count)) {
				count++;
			}
			max = count;
		}

		return strs[0].substring(0, max);
	}

	public static String findLongestCommonPrefix(String[] strs) {

		if (strs.length == 0)
			return "";
		String commonprefix = strs[0];
		for (int i = 1; i < strs.length; i++)
			while (strs[i].indexOf(commonprefix) != 0) {
				commonprefix = commonprefix.substring(0, commonprefix.length() - 1);
				if (commonprefix.isEmpty())
					return "";
			}
		return commonprefix;
	}

}
