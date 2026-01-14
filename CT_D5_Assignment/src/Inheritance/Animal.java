package Inheritance;

public class Animal {

	String name;
	String color;
	int leg;
	
	public void printAnimal() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(leg);
	}
	
	public static void main(String[] args) {
		Dog d= new Dog("Golden Retriever","Golden",4);
		d.printAnimal();
	}
	
	
}

class Dog extends Animal{
	
	Dog(String name,String color,int leg){
		this.name=name;
		this.color=color;
		this.leg=leg;
	}
}
