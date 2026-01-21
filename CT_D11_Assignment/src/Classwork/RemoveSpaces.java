package Classwork;

public class RemoveSpaces {

	public static String removeSpaces(String s) {
		return s.replace(" ","");
	}
	
	public static void main(String[] args) {
		String s= "ada adfasdgdfag  ds g dfg h dfg h dgh fg n fsdfds              ffd";
		System.out.println(removeSpaces(s));
	}
	
}
