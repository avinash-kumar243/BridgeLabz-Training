//Create SplitText Class to split the word from string 
import java.util.Scanner;
public class SplitText {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Taking input as str from user
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		// Calling a function to compute the length without built-in-method
		int length = countLength(str);
		
		// Calling a method to extract the word in text 
		String[] words1 = extractWord(str,length);
		
		String[] words2 = str.split("\\s+");
		
		// Displaying the ouput
		compareWords(words1,words2);
	}
	public static void compareWords(String str1[], String str2[]){
		int len = str1.length;
		
		for(int i=0; i<len; i++){
			String word1 = str1[i];
			String word2 = str2[i];
			if(word1.equals(word2)){
				System.out.println(word1+" --equals-- "+word2);
			}else{
				System.out.println(word1+" --Not equals-- "+word2);
			}
		}
	}
	public static String[] extractWord(String str, int len){
		int wordCount = 0;
		for(int i=0; i<len; i++){
			if(str.charAt(i)==' '){
				wordCount+=1;
			}
		}
		
		String word[] = new String[wordCount];
		String temp = "";
		int index = 0;
		for(int i=0; i<len; i++) {
			if(str.charAt(i) != ' ') {
				temp += str.charAt(i);
			} else {
				word[index++] = temp;
				temp = "";
			}
		}
		return word;
	}
	public static int countLength(String str){
		int len = str.length();
		int count = 0;
		
		try{
			int i=0;
			while(true) {
				str.charAt(count++);
			}
		}catch(Exception e){
			
		}finally{
			return count-1;
		}
	}
}