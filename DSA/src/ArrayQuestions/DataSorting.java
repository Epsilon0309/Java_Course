package ArrayQuestions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataSorting {

    
//    public static List<List<String>> getSortedList(List<List<String>>employees){
//
//    		Comparator<List<String>>dateOfBirth = (e1,e2) -> LocalDate.parse(e1.get(4)).compareTo(LocalDate.parse(e2.get(4)));
//    		Comparator<List<String>>timeOfBirth = (e1,e2) -> LocalTime.parse(e1.get(5)).compareTo(LocalTime.parse(e2.get(5)));
//    		
//    		Collections.sort(employees,dateOfBirth.thenComparing(timeOfBirth));
//    	
//    	return employees;
//    }
    
    
    public static List<List<String>> getSortedList(List<List<String>>employees){
    	
    	employees.sort((a,b)->(a.get(4)+a.get(5)).compareTo((b.get(4)+b.get(5))));
    	
    	return employees;
    }
    
    public static void main(String[] args) {
		
		List<List<String>> data = new ArrayList<>();
		 
		data.add(List.of("201", "Zayan", "zayan@gmail.com", "4", "1997-11-23", "09:40", "9876543210"));
		data.add(List.of("202", "Meera", "meera@gmail.com", "2", "2001-06-14", "07:20", "9123456789"));
		data.add(List.of("203", "Arjun", "arjun@gmail.com", "6", "1995-03-02", "10:05", "9988776655"));
		data.add(List.of("204", "Kavya", "kavya@gmail.com", "3", "1997-11-23", "06:50", "8899001122"));
		data.add(List.of("205", "Ishaan", "ishaan@gmail.com", "5", "1999-09-18", "08:30", "9001122334"));
		data.add(List.of("206", "Ritika", "ritika@gmail.com", "1", "2001-06-14", "09:10", "9011223344"));
		
		System.out.println(data);
		
		System.out.println(getSortedList(data));
		
		getSortedList(data).forEach(e -> System.out.println(e));
	}
	
}
