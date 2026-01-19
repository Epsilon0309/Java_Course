package HasAReln;

public class Human {

	private Heart heart;// Strong Association i.e composition
	private Address address;// weak association i.e aggregation

	// during the object initialization heart is already included
	public Human() {
		heart = new Heart();
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static void main(String[] args) {

		Human human = new Human();
		human.heart.pump();
// loose coupling
		human.setAddress(new Address());
		
		Address address = new Address();// tight coupling
		human.getAddress().location();
	}

}

class Heart {
	public void pump() {
		System.out.println("Heart is pumping");
	}
}

class Address {
	public void location() {
		System.out.println("India");
	}
}
