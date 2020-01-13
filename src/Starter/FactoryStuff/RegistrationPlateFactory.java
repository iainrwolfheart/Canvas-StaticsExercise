package Starter.FactoryStuff;

public class RegistrationPlateFactory {
	private static String[] regPlates 
	    = { "B1G 805S", "BE61 NER", "FR0 5TY", "HNZ57","CHA 210T", "JB007", "FA12 COP" };

	private static int nextAvailablePlate = 0;

	public static RegistrationPlate createPlate () {
		if (nextAvailablePlate < regPlates.length) {
			RegistrationPlate rp = new RegistrationPlate(regPlates[nextAvailablePlate++]);
			return rp;
		}		
		
		return new RegistrationPlate("XXXX");
	}
}
