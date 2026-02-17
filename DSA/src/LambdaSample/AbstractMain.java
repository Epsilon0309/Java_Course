package LambdaSample;

abstract class Parent {
	abstract void function(Number number);
	abstract void function(Integer integer);
}

class Child extends Parent{

	@Override
	void function(Number number) {
		System.out.println("Number"+ number);
		
	}

	@Override
	void function(Integer integer) {
		System.out.println("Integer"+ integer);
		
	}
	
}

public class AbstractMain{
	public static void main(String[] args) {
		
		Parent p1 = new Parent() {

			@Override
			void function(Number number) {
				System.out.println("Number"+number);
				
			}

			@Override
			void function(Integer integer) {
				System.out.println("Integer"+integer);
				
			}
			
		};
		
		p1.function(4);
		p1.function(4.5);
		
//		Parent p = new Child();
//		
//		p.function(4);
//		p.function(4.5);
	}
}