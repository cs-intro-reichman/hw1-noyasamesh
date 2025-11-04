public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt( "" + args[0].charAt(3) + args[0].charAt(4));
		String halfDay = "AM"; 
		if (hours == 12)
		    halfDay = "PM";
		if (hours > 12) {
			hours = hours - 12;
			halfDay = "PM";
		}
		else { 
			if (hours < 10)
			hours = Integer.parseInt("" +args[0].charAt(1));
		}
		if (hours==24){
		    hours = hours - 24;
		}
		System.out.print(hours + ":" );
		if (minutes < 10)
		    System.out.print("0"+minutes);
		else System.out.print(minutes);
		    System.out.println(" " + halfDay);  
	}
	

}
