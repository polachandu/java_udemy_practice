package stringsExcercise;

public class stringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			String daysWithMostCharacters = "";
			for(String day:daysOfWeek) {
				if(day.length()> daysWithMostCharacters.length()) {
					daysWithMostCharacters=day;
				}
				
			}
			System.out.println("Days with most number of charachters: "+daysWithMostCharacters);
			for(int i=daysOfWeek.length-1;i>=0;i--) {
				System.out.println(daysOfWeek[i]);
			}
	}

}
