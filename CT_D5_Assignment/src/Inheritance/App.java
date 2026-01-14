package Inheritance;

public class App {
	
	String type;
	int size;
	
	public static void main(String[] args) {
		WhatsApp w= new WhatsApp("Social Media",2,"Chatting",16);
		System.out.println(w.type);
		System.out.println(w.size);
		System.out.println(w.purpose);
		System.out.println(w.version);
	}

}

class WhatsApp extends App{
	
	String purpose;
	int version;
	
	public WhatsApp(String type,int size,String purpose,int version) {
		this.type=type;
		this.size=size;
		this.purpose=purpose;
		this.version=version;
		
	}
	
	
}
