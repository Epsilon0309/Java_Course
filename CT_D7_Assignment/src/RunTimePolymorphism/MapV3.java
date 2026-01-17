package RunTimePolymorphism;

public class MapV3 extends MapV2{

	public void bookCab() {
		System.out.println("We can book rapido and Uber");
	}
	
	public static void main(String[] args) {
		System.out.println("--------Version 3-------");
		MapV3 v3 = new MapV3();
		v3.route();
		v3.bookCab();
		System.out.println("--------Version 2-------");
		MapV2 v2 = new MapV2();
		v2.route();
		System.out.println("--------Version 1-------");
		MapV1 v1 = new MapV1();
		v1.route();
		
		System.out.println("-----Upcast v3 to v1 it will show the v2 as v2 will override-----");
		MapV1 v = new MapV3();
		v.route();
		
//		MapV2 vew = (MapV2)v;
//		vew.route();
		
		System.out.println("---Downcast---");
		MapV3 ve = (MapV3)v;
		ve.route();
		ve.bookCab();

	}
	
}
