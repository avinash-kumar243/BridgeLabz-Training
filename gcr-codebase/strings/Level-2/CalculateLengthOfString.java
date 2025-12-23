import java.util.Scanner;
// Find Length Of the String
public class CalculateLengthOfString {
	public static int countLength(String str){
		int len = str.length();
		int count = 0;
		
		try {
			int i=0;
			while(true){
				str.charAt(count++);
			}
		} catch(Exception e) {
			
		} finally{
			return count-1;
		}
	}
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		//Taking input as string from user
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		// Calling function to compare both strings
		int result = countLength(str);
		
		//displaying the result
		System.out.println("The length of string is : " + result);
	}
}