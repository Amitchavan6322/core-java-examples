import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {

        String[] studentNames = {"Rahul", "Shubham", "Rajesh", "Shreya"};

        // conversion of fixed array to array list using Array.asList
        List students = Arrays.asList(studentNames);
        System.out.println("Students at line 14: " + students);

        // following line will give unsupported error as we are adding elements to fixed size list to avoid it refer line no. 20 onwards
        //students.add("Akshay");
        //System.out.println("Students at line 18: "+students);

        ArrayList<String> studentAL = new ArrayList<>(Arrays.asList(studentNames));

        studentAL.add("Akshay");
        studentAL.add("Vaishnavi");

        System.out.println("Students at line 24: " + studentAL);


        // using add all method:
        List<String> al = new ArrayList<String>();

        // adding elements of array to arrayList.
        // Collections.addAll(al, studentNames);
        // System.out.println(al);

    }
}
