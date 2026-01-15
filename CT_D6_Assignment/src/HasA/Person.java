package HasA;

//Composition

public class Person {

	String name;
	Pancard pancard;
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name= "Dinga";
		// Object inside another object
		Pancard card = new Pancard();
		card.panId = "ABC123";
		card.dob = "14/04/2001";
		
		person.pancard=card;
		
		System.out.println(person.name);
		System.out.println(person.pancard.panId);
		System.out.println(person.pancard.dob);
	}
	
}
