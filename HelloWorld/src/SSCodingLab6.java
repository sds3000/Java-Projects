
public class SSCodingLab6 {
	
	public static void main(String[] args) {
		tree();
	}
	/*Write a program that adds numbers between 1 to 100 and prints the result.
	 *  Do it three times, use for loop, then while loop, then do-while loop.
	 */
	private static void counter() {
		int number = 0;
		for(int i =0; i<101;i++) {
			number += i;
			
		}
		System.out.println(number);
	}
	private static void counterWhile() {
		int i = 0;
		int number =0;
		while (i<100) {
			i++;
			number +=i;
			
		}
		System.out.println(number);
	}
	private static void counterDo() {
		int i =1 , number = 0;
		do {
			
			number +=i;
			i++;
				
		}while (i <101);
		System.out.println(number);
	}
	//2. •Write a program that prints numbers from 0 down to -100. Use while loop.
	private static void countDown() {
		int i=0,number=0;
		while (i > -100) {
			i--;
			number+=i;
		}
		System.out.println(number);
	}
	/*Write a program that adds numbers between 100 to 200 
	 * and prints the result. Use dowhile loop.
	 */
	private static void countUp(){
		int i =100,number=100;
		do {
			number+=i;
			i++;
		}while(i<200);
		System.out.println(number);
	}
	/*Write a program that adds odd numbers between 1 to 100 
	 * and prints the result. Use while loop.
	 */
	private static void countOdd() {
		int i = 0, number = 0;
		while (i<100) {
			i++;
			if (i%2 ==1) {
				number += i;
			}
			
		}
		System.out.println(number);
	}
	/*Write a program that averages even numbers between 5 to 30 
	 * and prints the result. Use do-while loop.
	 */
	private static void countEven() {
		int i = 5, number = 0;
		do {
			i++;
			number+=i;
		}while(i<30);
		System.out.println(number);
	}
	/*Write a program to create the following figure by using nested for loops.
	 * Please use parameters in order to change the size and number of triangles 
	 * as in the examples below, while being able to reuse the code.
	 */
	private static void tree() {
		int h = 6, n = 2;
		for(int i=0; i<n;i++) {
			
			for(int branch = 1; branch <= h*2; branch++){
				if(branch% 2 == 1) {
					for(int leaf = 1; leaf <=(branch); leaf++){
						System.out.print(".");
					
					}
					System.out.println();
				}
					
			}
		}
	}
}
