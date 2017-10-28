package stategy_delegate;

public class RadioImpl implements Radio {
    @Override
    public void setVolume(int volume) {
        System.out.println("some volume logic is running");
    }

    @Override
    public void setChannel(double channel) {
        System.out.println("some channel logic is running");
    }
}
