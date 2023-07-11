
public class BitLogicalExample {

	public static void main(String[] args) {
		int num1 = 0b1111_1000;
		int num2 = 0b0001_1111;
		
		/*
		 * 	1111_1000
		 * & 0001_1111
		 * ============
		 * 	 00011000
		 */
		int result1 = num1 & num2;	// 24
		/*
		 * 	1111_1000
		 * | 0001_1111
		 * ============
		 * 	 1100111
		 */
		int result2 = num1 | num2; // 25
		/*
		 * 	11111000
		 * ^ 00011111
		 * ============
		 * 	 1100111
		 */
		int result3 = num1 ^ num2; // 231

	}

}
