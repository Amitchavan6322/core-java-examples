import java.util.*;

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

        // add method
        studentAL.add("Akshay");
        studentAL.add("Vaishnavi");

        System.out.println("Students at line 26: " + studentAL);

        // get method
        System.out.println("getting 3rd student name : " +studentAL.get(2));

        // remove method
        System.out.println("removing 4th student :" +studentAL.remove(4));
        System.out.println("printing remaining student list : " +studentAL);

        boolean oldStudentsAdded = Collections.addAll(studentAL, "Amit", "Ashish");
        System.out.println("old list is " +(oldStudentsAdded ? "": "NOT ") + "updated");

        //add all
        List<String> newStudentList  = new ArrayList<>();
        newStudentList.addAll(studentAL);
        System.out.println("new student list "+newStudentList);

        // contains - returns true if list contains specified element
            if(newStudentList.contains("Amit")){
                System.out.println("student list has Amit");
            }

            // size
        System.out.println("size of student list : "+newStudentList.size());

            //iterator() - returns iterator object that can be used to sequentially access elements
        Iterator<String> studentIterator = newStudentList.iterator();
        while(studentIterator.hasNext()){
            System.out.println("next student line 51 : " +studentIterator.next());
        }

        ListIterator<String> studentIterator2 = newStudentList.listIterator();
        while(studentIterator2.hasNext()){
            System.out.println("next student in ListIterator : " +studentIterator2.next());
        }

        while (studentIterator2.hasPrevious()) {
            System.out.println("previous student in ListIterator : " +studentIterator2.previous());
        }


        //toArray() - converts list into an array
        String[] studentArray = newStudentList.toArray(String[]::new);
        System.out.println("Student array "+studentArray);
        
        // using add all method:
        List<String> al = new ArrayList<String>();

        // adding elements of array to arrayList.
        // Collections.addAll(al, studentNames);
        // System.out.println(al);

    }
}
