package lab1;

public class StartFromHere {
    public static void main(String[] args) {


        Person p1 = new Person("Vasya", 12,"pupkin");
        Person p3 = new Person("Vasya", 18,"pupkin");
        Person p2 = new Person("Petys", 13,"pupkin");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        System.out.println(p1.equals(p3));


    }
}
