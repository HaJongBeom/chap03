
public class BitShiteExample {

	public static void main(String[] args) {
		int num = 0b000_0001;
		/*
		 * 	000001
		 * 	<< 1
		 *  =======
		 *  0000010
		 */
		int result1 = num << 1; // 2
		/*
		 * 	000001
		 * 	<< 2
		 *  =======
		 *  0000100
		 */
		
		int result2 = num << 2; // 4
		/*
		 * 	0000001
		 * 	<< 4
		 *  =======
		 *  0010000
		 */
		int result3 = num << 4; // 16
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
