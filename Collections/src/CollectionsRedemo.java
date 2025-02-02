import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsRedemo {

    private static List<Integer> numberList = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(numberList, 56, 89, 5489, 4568, 789, 5);

        System.out.println("printing list before sort " +numberList);

        //Collections.sort(numberList);
        //System.out.println("printing list after sort " +numberList);

        System.out.println("printing min no. from list " +Collections.min(numberList));
        System.out.println("printing max no. from list " +Collections.max(numberList));

        Collections.reverse(numberList);
        System.out.println("printing reverse list " +numberList);

        Collections.swap(numberList, 0,2);
        System.out.println("printing swapped list " +numberList);

        



    }
}
