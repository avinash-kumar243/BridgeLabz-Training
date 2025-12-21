// Writing a program to print weather Spring seasor or not
public class SpringSeasonCheck {
	// checking whether Spring season or not
	public boolean springSeasonCheck(int day, int month) {
		if((month == 3 &&  day >= 20) || month == 4 || month == 5 || (month == 6 && day <= 20)) return true;
		else return false;
	}
	
	public static void main(String args[]) {
		// Taking day and month input from command line
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		// Writing a method to check whether spring season or not
		SpringSeasonCheck obj = new SpringSeasonCheck();
		boolean isSpring = obj.springSeasonCheck(day, month);
		
		if(isSpring) System.out.println("Spring Season");
		else System.out.println("Not a Spring Season");
	}
}