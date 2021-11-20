/*
 * Creates and declares each array and assigns the values
 * Prints a table with test number, scores and letter grades
 * Prints the highest score, the lowest score, the average and the final letter grade
*/
public class SSmithCodingLab7 {

	public static void main(String[] args) {
		
		int[] test = {1,2,3,4,5}, score = {75,80,77,79,82};
		char[] grade = {'C','B','C','C','B'};
		int i,  y=0, z = score[0];
		double x = 0;
		char finalGrade =' ';
		//prints grid format
		System.out.println("Test Score Grade");
		//
		for(i = 0; i< test[test.length -1];){
			
			//print out test score grade in a table
			System.out.println(test[i] + "    " + score[i] + "    " + grade[i] );
			
			//counter 
			i++;
			
			//adds test scores to find the Average score later
			x+=score[i-1];
			
			
			//finds the highest score 
			if (y < score[score.length -1]) {
				y=score[score.length - 1];
					
			}
			
			//finds the lowest score
			if (score[score.length -1] < z) {
				z = score[score.length -1];
				System.out.println(z);
			}
				
		}
		//Determines the final letter grade.
		if(x/5>89 && x/5 < 101) {
			finalGrade = 'A';
		}
		else if(x/5 <= 89 && x/5 >=80) {
			finalGrade = 'B';
			
		}
		else if(x/5 <80 && x/5 >=70) {
			finalGrade = 'C';
		}
		else if(x/5< 70 && x/5>= 60) {
			finalGrade = 'D';
			
		}
		else if (x/5 >69){
			finalGrade = 'F';
			
		}
		System.out.printf("Your average is %.1f\n\nYour highest score was %d\n\nYour lowest score was %d\n\nYour final grade is %c", x/5, y,z,finalGrade);
		
	}
	

}
