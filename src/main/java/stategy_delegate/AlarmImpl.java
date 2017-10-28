package stategy_delegate;

import java.util.Date;

public class AlarmImpl implements Alarm {
    @Override
    public void stop() {
        System.out.println("some topping logic is running");
    }

    @Override
    public void setTime(Date date) {
        System.out.println("some settime logic is running");
    }
}
