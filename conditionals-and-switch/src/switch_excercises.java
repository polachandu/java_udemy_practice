import java.util.Scanner;

public class switch_excercises {

	public static String determineNameOfMonth(int monthNumber) {

		switch (monthNumber) {
		case 1:
			return "Jan";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return "Apr";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "Aug";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dec";

		}
		String invalid = "Wrong option";
		return invalid;
	}

	public static boolean isWeekDay(int dayNumber) {  //fall through method
		switch (dayNumber) {
		case 0: 
		case 6: return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:return true;

		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isWeekDay(7));
		//System.out.println(determineNameOfMonth(19));

	}

}
