import java.util.ArrayList;
import java.util.Scanner;

public class ColorList {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> colorList = new ArrayList<>();
        System.out.println("Enter number of colors you would like to add to the list");
        int i = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < i; j++) {
            System.out.println("Enter " +(j+1) +" color name");
            colorList.add(sc.nextLine());
        }

        // print array list
        System.out.println("Entire array list " +colorList);

        // iterate through array list
        for (String elements: colorList){
            System.out.println(elements);
        }

        // insert element at first position
        colorList.add(0,"Brown");
        System.out.println("Array list after adding Brown color: "+colorList);

        // retrieve 4th element
        System.out.println("Get 4th element : " +colorList.get(3));

    }

}
