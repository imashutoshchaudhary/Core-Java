
public class OperatorsDemo {
	
	/*
	 * 
	 * Arithmetic  +,-,*,/,%
	 * Bitwise
	 * Relational
	 * Logical
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int m = 6, n = 4;
		int r1 = m+n;
		int r2 = m-n;
		int r3 = m*n;
		double r4 = (double)m/n;
		
		int r5 = m%n;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
		int j = 5;
		int k = 7;
		
		k += j;   // Shorthand Operator like k = k + j;
				  /*
				   * k++ //post increment
				   * ++k //pre increment
				   */
		System.out.println(k);
		
		
	}

}
