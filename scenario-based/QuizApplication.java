/* 17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/


import java.util.Scanner;
public class QuizApplication {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("\n--------------------------------------------------------------");
		System.out.println("------------------ Online Quiz Application -------------------");
		System.out.println("----------------------------------------------------------------\n");
		
		String questions[] = { "1. Who is the founder of Java? \na. James Gosling \nb. Dennis Ritchie \nc. Bjarne Stroustrup \nd. Guido van Rossum",
							   "2. What is the output of System.out.println(10 / 3); in Java? \na. 3.333... \nb. 3  \nc. 10/3 \nd. Compilation Error",
							   "3. What is the entry point for a Java application? \na. start() method \nb. init() method \nc. main() method \nd. execute() method", 
							   "4. Which of the following is a primitive data type in Java? \na. String \nb. Integer \nc. boolean \nd. Array", 
							   "5. What keyword is used to create an object of a class in Java? \na. new \nb. create \nc. instance \nd. this" };
		
		
		char correctOptions[] = {'a', 'b', 'c', 'c', 'a'};
		
		char response[] = new char[5];
		
		System.out.println("\nChoose correct options either a, b, c, or d\n");
		
		for(int i=0; i<questions.length; i++) {
			System.out.println("\n" + questions[i] + "\n");
			
			response[i] = sc.next().charAt(0);
		}
		
		int result = 0;
		for(int i=0; i<response.length; i++) {
			char ch = response[i];
			switch(ch) {
				case 'a', 'b', 'c', 'd' -> {
					if(ch == correctOptions[i]) result++;
				}
			};
		}
		System.out.println("\nYour score is : " + result + "\n");
	}
}