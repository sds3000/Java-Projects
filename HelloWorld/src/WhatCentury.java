import java.util.Scanner;

public class WhatCentury {
	
	public static void main(String[] args) {
		System.out.print(century());
		System.out.println(alt());
		System.out.println(alt2());
	}
	public static int century() {
		//initializes scanner
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(), x= 0;
		
		//century of the input year over 100
		if (year >= 101){
			//for the last year of each century (1000,2000...)
			  if( year%100 == 0){
			    x = year/100;
			  }
			  //for every other year
			  else {
				  x= year/100 +1;
			  }
			 }
			//for the first century
		    else if (year <= 100) {
		      x = 1;
		    }
		
		return x;
		    
		  
	}
	public static int alt() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return (int)Math.ceil((double)number/100);
	}
	public static int alt2() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
        return ((number % 100 == 0))? (number = number / 100 ) :  (number = (number / 100) + 1);

	}
	

}
