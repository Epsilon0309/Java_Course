package ClassWork1;

public class College {

	String name;
	String location;
	
	public void exam() {
		System.out.println(name+" college takes exam");
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(location);
		exam();
	}
	
	public static void main(String[] args) {
		College iem = new College();
		iem.name="Institute of Engineering and Management";
		iem.location="Sector-V";
		//iem.exam();
		iem.print();
	}
	
}
