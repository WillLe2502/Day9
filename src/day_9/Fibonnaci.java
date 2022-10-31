package day_9;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int finbonaciAt8 = finbonnaci(8);
		System.out.println(finbonnaci(20));
		System.out.println(improveFibonacci(20));
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
		int fn = 1;
		int counter = 3;
		
		while (counter <= x) {
			f0 = f1;
			f1 = fn;
			fn = f0 + f1;
			counter++;
		}
		
		return fn;
	}
	
	

}
