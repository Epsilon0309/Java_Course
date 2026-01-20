package ObjectClass;

public class Parent {

	String name;
	int id;
	 
	public Parent(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "id:"+id+"XYZ"+name;
	}
	
	public static void main(String[] args) {
		Parent p = new Parent(10,"xyz");
		System.out.println(p.toString());
		
	}
	
}
