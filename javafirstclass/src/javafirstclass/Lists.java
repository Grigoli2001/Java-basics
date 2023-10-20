package javafirstclass;


import java.util.ArrayList;
import java.util.List;

public class Lists {
	String value = "I really don't like java language";
	List<String> colors = new ArrayList<String>();

    
	public void stringExercise() {
	    colors.add("Green");
	    colors.add("Yellow");
	    colors.add("Blue");
	for(String i : colors){
		System.out.print(i + "\n");
	}

	System.out.println(value.toLowerCase());
	System.out.println(value.toUpperCase());
	}
	
	public static void main(String[] args) {
		Lists test = new Lists();
		test.stringExercise();
	}
}
