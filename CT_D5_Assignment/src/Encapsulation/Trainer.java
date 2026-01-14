package Encapsulation;

public class Trainer {
	
	private int id;
	private String name;
	private int password;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPassword() {
		return password;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPassword(int pass) {
		this.password=pass;
	}

}
