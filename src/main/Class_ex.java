package main;

class Vehicle1 {
	int passengers;
	int fuelcap;
	int mpg;
}

public class Class_ex {

	public static void main(String[] args) {
		Vehicle1 minivan = new Vehicle1();
		Vehicle1 sportscar = new Vehicle1();
		
		int range1, range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;
		
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of "+range1);
		System.out.println("Sportscar can carry " + sportscar.passengers + "with a range of " + range2);
		

	}

}
