package app1;

public class WorkingForTheWeekend {

	public static void main(String[] args) {
		String day = "Friday";
		switch (day) {
		case "Monday":
			System.out.println("Oh God it's Monday");
			break;
		case "Tuesday":
			System.out.println("One down, Four to Go");
			break;
		case "Wednesday":
			System.out.println("Huuuuump Daaaay");
			break;
		case "Thursday":
			break;
		case "Friday":
			System.out.println("Party Time");
		}
		System.out.println("Today is " + day);
	}

}
