package exercies6;

import java.util.ArrayList;
import java.util.Scanner;
public class replace {
	
	static ArrayList<String> list = new ArrayList<>();
        
        static String str;
	static String [] s1;
	static String s2;
	
	public static void repeat() {

		for (int i = 0; i < s1.length; i++) {
			if (i < s1.length - 1 && s1[i].equals(s1[i + 1])) {
				s1[i] = " ";
				s1[i + 1] = "REPEAT";
				i++;
			}
			list.add(s1[i]);
		}
		for (int j = 0; j < list.size(); j++)
			System.out.print(list.get(j) + " ");
		System.out.println();
	}

	

	public static void testA() {
		 str = "I want to to go to the the zoo";
		 s1 = str.split("\\s+");
		 s2 = "";
		
		System.out.println("I want to to go to the the zoo");
		System.err.print("Expect :");
		repeat();
		System.out.println("Real: I want REPEAT go to REPEAT zoo ");
		list.removeAll(list);
		
	}
	public static void testB() {
		 str = "I am am a student";

		 s1 = str.split("\\s+");
		 s2 = "";
		System.out.println("Input:I am am a student");		
		System.err.print("Expect out: ");
		repeat();
		System.out.println("I REPEAT a student ");
		list.removeAll(list);
		
	}
	
	public static void testC() {
		str = "I go to the the mail";

		 s1 = str.split("\\s+");
		 s2 = "";
		System.out.println("I go to the the mail");
		System.err.print("Expect:");
		repeat();
		System.out.println("Real: I go to REPEAT mail ");
		list.removeAll(list);
		
	}
	
	public static void testD() {
		 str = "Do you you love me me";

		 s1 = str.split("\\s+");
		 s2 = "";
		System.out.println("Do you you love me me");
		System.err.print("Expect :");
		repeat();
		System.out.println("Real : Do REPEAT love REPEAT");
		list.removeAll(list);
		
	}
	
	public static void testE() {
		 str = "Hello Hello ";

		 s1 = str.split("\\s+");
		 s2 = "";
		System.out.println("Input:Hello Hello ");
		System.err.print("Expect :");
		repeat();
		System.out.println("Real:REPEAT  ");
		list.removeAll(list);
		
	}
	
    public static void main(String[] args) {
            /*To do code here*/
		testA();
		testB();
		testC();
		testD();
		testE();
	
	}
}
