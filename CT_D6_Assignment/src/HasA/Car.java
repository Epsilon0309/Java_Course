package HasA;

public class Car {

	private int id;
	private String color;
	private String brand;
	private Engine eng;
	
	public int getId() {
		return id;
	}
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
	public Engine getEngine() {
		return eng;
	}
	
	
	public void setId(int id) {
		this.id=id;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setEngine(Engine engine) {
		this.eng=engine;
	}
	
	public Car(int id,String brand,String color,Engine eng) {
		setId(id);
		setColor("Black");
		setBrand("BMW");
		setEngine(eng);
	}
	
	
}
