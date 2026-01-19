package Interface;

public class AnimalDriver {

public static void main(String[] args) {
	Dog g = new Dog();
	g.sound();
	
	Animal a = new Lion();// UC
	a.sound();
	Lion l=(Lion)a;
	l.color();
	//Dog o =(Dog)a; // ClassCastException
		
}
	
}
