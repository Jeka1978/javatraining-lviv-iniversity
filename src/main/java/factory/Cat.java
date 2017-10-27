package factory;

public class Cat implements Animal {

    @InjectRandomInt(min = 30, max = 70)
    private int length;
    @Override
    public void makeVoice() {
        System.out.println("mau mau");
    }
}
