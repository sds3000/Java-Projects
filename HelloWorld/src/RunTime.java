import java.util.Scanner;
public class RunTime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Lap in seconds");
		int firstLap = sc.nextInt();
		
		System.out.println("Second Lap in seconds");
		int secondLap = sc.nextInt();
		
		System.out.println("Third Lap in seconds");
		int thirdLap = sc.nextInt();
		
		System.out.println("Fourth Lap in seconds");
		int fourthLap = sc.nextInt();
		
		double fullTime = firstLap  + secondLap + thirdLap + fourthLap;
		double avgTime = fullTime/4;
		int min = (int)fullTime/60 , seconds = (int)fullTime - (min *60);
		System.out.println("The average time for your laps is " + avgTime);
		System.out.println("your mile time is " + min + " minutes " + seconds + " seconds.");
		
		
	}
	
}
