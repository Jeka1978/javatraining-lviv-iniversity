package enums;

public class Main {
    public static void main(String[] args) {
        Person mstislav = new Person("Mstislav", MaritalStatus.SINGLE);
        Person yaroslav = new Person("Yaroslav", MaritalStatus.SINGLE);


        MaritalStatus maritalStatus = MaritalStatus.findByDbCode(20);
        System.out.println(maritalStatus.getRussianDesc());
    }
}
