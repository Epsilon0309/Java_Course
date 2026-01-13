package TakingInput;

import java.util.Scanner;

public class charInput {
public static void main(String[] args) {
	Scanner ab= new Scanner(System.in);
	System.out.println("Enter the char: ");
	char ch = ab.next().charAt(0); // inserting at the 0th index of the single valued array ie. there i one element present
	System.out.println(ch);
}
}
