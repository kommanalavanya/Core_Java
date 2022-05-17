package ai.jobiak.taskenums;

public class UseEnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Browser ref1;
		System.out.println("Browser");
		System.out.println();
		for (Browser elements : Browser.values()) {
			System.out.println(elements + "  " + elements.ordinal());
		}
		System.out.println();
		System.out.println("Cards");
		System.out.println();
		for (Cards elements : Cards.values()) {
			System.out.println(elements + "," + "no. of cards are " + elements.showcards() + " ," + "index= "
					+ elements.ordinal());
		}
		System.out.println();
		System.out.println("ChessPieces");
		System.out.println();
		for (ChessPieces piece : ChessPieces.values()) {
			System.out.println(piece);
		}
		System.out.println();
		System.out.println("ChessPieces");
		System.out.println();
		for (ChessPieces piece : ChessPieces.values()) {
			System.out.println(piece);
		}
		System.out.println();
		System.out.println("Days");
		System.out.println();
		for (Days day : Days.values()) {
			System.out.println(day);
		}
		System.out.println();
		System.out.println("Directions");
		System.out.println();
		for (Directions direction : Directions.values()) {
			System.out.println(direction);
		}
		System.out.println();
		System.out.println("Planets");
		System.out.println();
		for (Planets planet : Planets.values()) {
			System.out.println(planet);
		}
		System.out.println();
		System.out.println("Seasons");
		System.out.println();
		for (Season type : Season.values()) {
			System.out.println(type);
		}
		System.out.println();
		System.out.println("Sizes");
		System.out.println();
		for (Sizes size : Sizes.values()) {
			System.out.println(size);
		}
		System.out.println();
		System.out.println("Transport");
		System.out.println();
		for (Transport type : Transport.values()) {
			System.out.println(type);
		}
		System.out.println();
		System.out.println("Months");
		System.out.println();
		for (Months month : Months.values()) {
			if (month == Months.February) {
				System.out.print(month + "," + "no. of days in leap year are ");
				System.out.print(month.showLeap());
				System.out.println(" no. of days in nonleap year are ");
				System.out.print(month.showNonLeap());
				System.out.println();

			} else {
				System.out.println(month + "," + "no. of days are " + month.showDays());
			}
		}
		
	}

}
