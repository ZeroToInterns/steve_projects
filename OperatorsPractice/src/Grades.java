
public class Grades{
	
	public static String giveGrade(int giveGrade) {
		if(giveGrade>=90 && giveGrade<100) {
			if(giveGrade>=90 && giveGrade<93) {
				return "A-";
			}
			else if(giveGrade>=94 && giveGrade<96) {
				return "A";
			}
			else {
				return "A+";
			}
		}
		
		else if(giveGrade>=80 && giveGrade<90) {
			if(giveGrade>=80 && giveGrade<83) {
				return "B-";
			}
			else if(giveGrade>=80 && giveGrade<6) {
				return "B";
			}
			else {
				return "B+";
			}
		}
		else if(giveGrade>=70 && giveGrade<80) {
			if(giveGrade>=70 && giveGrade<73) {
				return "C-";
			}
			else if(giveGrade>=74 && giveGrade<76) {
				return "C";
			}
			else {
				return "C+";
			}
		}
		else if(giveGrade>=60 && giveGrade<70) {
			return"D"; 
		}
		else if(giveGrade>=50 && giveGrade<60) {
			return "F"; 
		}
		else {
			return "Z";
		}
	}
	// write a static method called giveGrade that takes 
	// in a grade percentage and returns a char with is a letter grade
	
	//Either A, B, C, D, or F
	//If the number is greater than 100 or less than 0, return NULL; 
	

public static void respondToGrade(char grade) {
	switch(grade) {
		case 'A':
			System.out.println("Good Job.");
			break;
		case 'B':
			System.out.println("Okay Job.");
			break;
		case 'C':
			System.out.println("Okay.");
			break;
		case 'D':
			System.out.println("Try Again.");
			break;
		case 'F':
			System.out.println("Nope.");
			break;
		default:
			System.out.println("Nah.");
			
	}
}
}