package Interface;

public class HelpVehicle {

	public static Vehicle getVehicle() {
		return new Bike(); // UC is done as bike is stored inside vehicle
	}
	
}
