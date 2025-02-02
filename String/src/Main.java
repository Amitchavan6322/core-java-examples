public class Main {
    public static void main(String[] args) {
        String name = "Amit";
        String name1 = new String("Amit");
        System.out.println("name = " +name);
        System.out.println("name1 = " +name1);

        StringBuilder name2 = new StringBuilder(" amit");
        System.out.println("name2 = "+name2);
        name2 = new StringBuilder(name2.toString().trim());
        System.out.println("name2 = "+name2);
    }

}