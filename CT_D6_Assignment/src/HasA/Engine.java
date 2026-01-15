package HasA;

public class Engine {

	private int cc;
	private String fuelType;
	
	public int getCC() {
		return cc;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
	public void setCC(int cc) {
		this.cc=cc;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType=fuelType;
	}
	
	public Engine(int cc,String fuel) {
		setCC(cc);
		setFuelType(fuel);
	}
}
