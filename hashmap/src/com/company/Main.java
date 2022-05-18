package com.company;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
       // Scanner sc  = new Scanner(System.in);
        HashMap<Integer,String> student = new HashMap<>();

        // adding key and values to the HashMap

        student.put(1,"kailash");
        student.put(2,"parthiban");
        student.put(3,"Mouli");
        student.put(4,"ajay");
        student.put(5,"tharun");
        student.put(6,"alagappan");
        student.put(7,"rakesh");
        student.put(8,"poul");
        System.out.println(student.size());
        // getting values from HashMap by using keys

        for(int i=student.size();i>=0;i--){
            System.out.println(student.get(i));
        }
        System.out.println("Before Replacing");
        System.out.println(student);

        // replacing values in HashMap

        System.out.println("After Replacing");
        student.replace(3,"moili raj kumar");
        System.out.println(student);

        //removing values in HashMap

        System.out.println("After removing Elements");
        student.remove(3);
        System.out.println(student);

    }
}
