package Inheritance;

public class WhatsAppVer1 {

	public void chat() {
		System.out.println("You can chat");
	}
	
	public static void main(String[] args) {
		WhatsAppVer1 w1 = new WhatsAppVer1();
		WhatsAppVer2 w2 = new WhatsAppVer2();
		WhatsAppVer3 w3 = new WhatsAppVer3();
		
		w1.chat();
		
		w2.chat();
		w2.status();
		
		w3.chat();
		w3.status();
		w3.metaAi();
	}
}

class WhatsAppVer2 extends WhatsAppVer1{
	public void status() {
		System.out.println("You can give status");
	}
}

class WhatsAppVer3 extends WhatsAppVer2{
	public void metaAi() {
		System.out.println("You can use meta ai also");
	}
}
