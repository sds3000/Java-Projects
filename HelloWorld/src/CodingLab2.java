import java.util.*;


/*
 * This Lab is a mortgage calculator that prompts the user for the principle, length of mortgage 
 * and annual rate and calculates the Total payment monthly payment and the ammount of intrest 
 * you will pay by the end of mortgage all rounded to 2 decimal places using the "printf" function.
*/
public class CodingLab2 {
	
	/*Prompt the user to enter the mortgage principal in dollars as an integer.
	Prompt the user to enter the length of the mortgage in years as an integer.
	Prompt the user to enter the annual interest rate in percentage as a double value.
	Convert the length from years to months.
	Convert the annual percent interest rate to monthly absolute interest rate.
	Compute the monthly payment in double type.
	Compute the total payment of the mortgage.
	Compute the total interest payment of the mortgage.
	Print the monthly payment, rounded to cents.
	Print the total payment, rounded to dollars.
	Print the total interest payment, rounded to dollars.
	*/
	public static void main(String[] args) {
		int p, length, n;
		double r, c, annualR, totalMortgage, totalIntrest;
		//initialize scanner
		Scanner sc = new Scanner(System.in);
		
		//ask for Principle
		System.out.println("Principal?");
		p = sc.nextInt();
		
		
		// ask or the length of the mortgage
		System.out.println("Mortgage length? ");
		length = sc.nextInt();
		//convert length of mortgage into months
		n = length*12;
		
		//Ask for the annual percentage Rate
		System.out.println("Annual Percentage Rate? ");
		annualR = sc.nextDouble();
		r = annualR/1200;
		
		c =(p *( r*Math.pow(1+ r, n)))/(Math.pow(1+r, n)-1); 
		totalMortgage = c*n;
		totalIntrest = totalMortgage - p;
		System.out.printf("Your monthly payment is %.2f\nYour total mortgage is %.0f\nYour total intrest is %.2f",c, totalMortgage,totalIntrest);
		
		
		
		

	}

}
