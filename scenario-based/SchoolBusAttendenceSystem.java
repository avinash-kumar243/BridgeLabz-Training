/* 9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/


import java.util.Scanner;
public class SchoolBusAttendenceSystem {
	
	// Writing a method to mark attendence of students
	public static void markAttendence(String students[], char attendence[]) {
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		
		// Loop to ask students attendence
		for(String student : students) {
			System.out.println("\nIs " + student + " Present?");
			System.out.println("Enter \"P\" for Present and \"A\" for Absent");
			
			char ch = sc.next().charAt(0);
			ch = Character.toLowerCase(ch);
			
			if(ch == 'p') attendence[idx] = 'P';
			else if(ch == 'a') attendence[idx] = 'A';
			else {
				// Invalid choise -> another character choose and did not choose either present or absent
				while(true) {
					System.out.println("\nInvalid Choise!!!");
					System.out.println("\nIs " + student + " Present?");
					System.out.println("Please enter \"P\" for Present and \"A\" for Absent");
					
					ch = sc.next().charAt(0);
					ch = Character.toLowerCase(ch);
					
					if(ch == 'p') {
						attendence[idx] = 'P';
						break;
					} else if(ch == 'a') {
						attendence[idx] = 'A';
						break;
					}
				}
			}
			
			idx++;
		}
		System.out.println("\n");
	}
	
	// Show total present and absent
	public static void showAttendence(String students[], char attendence[]) {
		
		int present = 0, absent = 0;
		
		System.out.println("------------------ Students and their attendence ------------------");
		for(int i=0; i<students.length; i++) {
			if(attendence[i] == 'P') {
				present++;
				System.out.println(students[i] + " -> Present");
			} else {
				absent++;
				System.out.println(students[i] + " -> Absent");
			}
		}
		
		System.out.println("\n\nTotal " + present + " students are Present and " + absent + " are absent");
	}
	
	// main method 
	public static void main(String args[]) {		
		String students[] = {"Komal", "Deepak", "Sonu", "Deepika", "Axar", "Patel", "Gautam", "Surbhi", "Jiya", "Anjali"};
		char attendence[] = new char[10];
		
		// mark and show student attendence
		markAttendence(students, attendence);
		showAttendence(students, attendence);
	}
}