import java.util.*;

public class SSmithCodingLab5 {

	public static void main(String[] args) {
		problem1();

	}
	public static void problem1() {
		int x = 3;
		if (x >0 && x < 10) {
			System.out.println("positive single digit number");
		}
	}
		public static void problem2() {
			/*public static void baffle(String blimp) {
				1) System.out.println(blimp);
				 2) zippo("ping", -5);
				}
				public static void zippo(String quince, int flag) {
					3,6) if (flag < 0) {
						4) System.out.println(quince + " zoop");
					} 7) else {
						8)System.out.println("ik");
						9)baffle(quince);
						10)System.out.println("boo-wa-ha-ha");
					}
				}
				public static void main(String[] args) {
					5) zippo("rattle", 13);
				}
*/
			
		}
		public static void problem3() {
			/*
			 * 3. What is the value of the parameter blimp when baffle gets invoked?
			 * quince
				4. What is the output of this program?
				blimp
				ping zoop
				ik
				baffle
				boo-wa-ha-ha
			 */
		/*public static void problem4() {
			zero
			one
			zero
		}*/
		public static void problem5() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number");
			k = scan.nextInt();
			
			switch(k) {
			case 0: System.out.println("vanilla");
			break;
			
			case 1: System.out.println("chocolate");
			break;
			
			case 2: System.out.println("Strawberry");
			break;
			
			default: System.out.println("error");
			break;
			}
		}
	}

}
