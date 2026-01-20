package AccessModifier;

public class DbConnect5 {
	
	private static int a=5;
	
	private DbConnect5() {
}
	
	public static DbConnect5 getDbConnect() {
		if(a>0) {
			a--;
			return new DbConnect5();
		}
		else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		DbConnect5 db1 = getDbConnect();
		System.out.println(db1);
		DbConnect5 db2 = getDbConnect();
		System.out.println(db2);
		DbConnect5 db3 = getDbConnect();
		System.out.println(db3);
		DbConnect5 db4 = getDbConnect();
		System.out.println(db4);
		DbConnect5 db5 = getDbConnect();
		System.out.println(db5);
		DbConnect5 db6 = getDbConnect();
		System.out.println(db6);
	}

}
