package Conditional_statement;

public class Class_reminder {
public static void main(String[] args) {
	String day = "Tuesday";
	
	String eng="Take English book today";
	String java="Take Java book today";
	String sql="Take SQL book today";
	
	//approach 1
	switch (day) {
	case "Monday":
	case "Thursday":
	case "Wednesday":{
		System.out.println(eng);
	}
	break;
	case "Tuesday":
	case "Saturday":{
		System.out.println(java);
	}
	break;
	case "Friday":{
		System.out.println(sql);
	}
	break;
	default:{
		System.out.println("Enjoy");
	}
	}
	
	//approach 2
	switch (day) {
	case "Monday", "Thursday", "Wednesday":{
		System.out.println(eng);
	}
	break;
	case "Tuesday", "Saturday":{
		System.out.println(java);
	}
	break;
	case "Friday":{
		System.out.println(sql);
	}
	break;
	default:{
		System.out.println("Enjoy");
	}
	}
	

}
}
