package ExceptionHandling;

public class IdNotExistException extends RuntimeException{

	int id;
	public IdNotExistException(String msg) {
		super(msg);
	}
	
	public IdNotExistException(int id) {
		this.id=id;
	}
	
	public static void idCheck(int id,IdNotExistException a) {
		if(a.id==id) {
			System.out.println("same id");
		}
		else {
			throw new IdNotExistException(id+" is present");
		}
	}
	
	public static void main(String[] args) {
		IdNotExistException a= new IdNotExistException(12);
		idCheck(12, a);
		try {
			idCheck(11, a);	
		}
		catch (IdNotExistException e) {
			System.out.println("IdNotExistException handled");
		}

	}
	
}
