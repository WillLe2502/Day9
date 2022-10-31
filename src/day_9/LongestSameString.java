package day_9;

public class LongestSameString {

	public static void main(String[] args) {
		String[] strs1 = { "flower", "flow", "flight" };
		String[] strs2 = { "dog", "racecar", "car" };
		
		System.out.println(longestSameString(strs1));
		//System.out.println(longestSameString(strs2));

	}

	public static String longestSameString(String[] strings) {
		int firstIndexLength = strings[0].length();
		int maxSameString = 0;
		int counter = 0;

		for (int i = 1; i < strings.length; i++) {
			counter = 0;
			System.out.println("i: " + i);
			while (counter < strings[i].length() 
					&& counter < firstIndexLength
					&& strings[i].charAt(counter) == strings[0].charAt(counter)) {
				
				counter++;
				if (counter < strings[i].length()) {
					System.out.println("counter: " + counter);
					System.out.println("strings[i].charAt(counter): " + strings[i].charAt(counter));
					System.out.println("strings[0].charAt(counter): " + strings[0].charAt(counter));
					System.out.println();
				} else {
					System.out.println("NULL");
				}
				
			}
			maxSameString = counter;
		}

		return strings[0].substring(0, maxSameString);
	}
}
