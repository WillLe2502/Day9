package day_9;

public class Main {

	public static void main(String[] args) {
		//O(2^n)
		System.out.println(finbonnaci(5));
		
		//O(n)
		System.out.println(improveFibonacci(5));
		
		//O(n * m) n is number of loop and m is number of index in string
		String[] strs1 = { "flower", "aalow", "flight" };
		String[] strs2 = { "dog", "racecar", "car" };
		
		System.out.println(longestSameString(strs1));
		System.out.println(longestSameString(strs2));

	}
	
	public static int finbonnaci(int x) {
		if (x == 0) return 0;
		if (x == 1) return 1;
		else {
			return finbonnaci(x - 2) + finbonnaci(x - 1);
		}
	}
	
	public static int improveFibonacci(int x) {
		int f0 = 0;
		int f1 = 1;
		int fn = 1;// thrid fibo f2 = 1;
		
		for (int i = 3; i <= x; i++) {
			f0 = f1;
			f1 = fn;
			fn = f0 + f1;
		}
		
		return fn;
	}
	
	public static String longestSameString(String[] strings) {
		int firstIndexLength = strings[0].length();
		int maxSameString = 0;
		int counter = 0;

		for (int i = 1; i < strings.length; i++) {
			counter = 0;
			//System.out.println("i: " + i);
			while (counter < strings[i].length() 
					&& counter < firstIndexLength
					&& strings[i].charAt(counter) == strings[0].charAt(counter)) {
				
				counter++;
//				if (counter < strings[i].length()) {
//					System.out.println("counter: " + counter);
//					System.out.println("strings[i].charAt(counter): " + strings[i].charAt(counter));
//					System.out.println("strings[0].charAt(counter): " + strings[0].charAt(counter));
//					System.out.println();
//				} else {
//					System.out.println("NULL");
//				}
				
			}
			maxSameString = counter;
		}

		return strings[0].substring(0, maxSameString);
	}

}
