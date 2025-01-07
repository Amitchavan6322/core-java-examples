import java.util.HashMap;
import java.util.Map;

public class CarClassDemo {

    private static Map<Integer, Car> myCarMap   = new HashMap<>();
    private static int counter = 0;

    public static void main(String[] args) {

        Car nexon = new Car();
        nexon.brand = "tata";
        nexon.model = "xz+";
        nexon.manufacturingYear = 2023;

        Car thar = new Car();
        thar.brand = "Mahindra";
        thar.model = "rox";
        thar.manufacturingYear = 2022;


        addCars(nexon, thar);

        for(Map.Entry<Integer, Car> carEntry : myCarMap.entrySet()){
            System.out.println("I have this car with details : " + carEntry.getKey() + " and " +carEntry.getValue());
        }
    }

private static void addCars(Car... cars){
        for (Car car : cars){
            myCarMap.put(++counter, car);
            //System.out.println(myCarMap.toString());
        }
}

}
