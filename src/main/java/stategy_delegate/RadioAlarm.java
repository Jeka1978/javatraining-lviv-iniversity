package stategy_delegate;

import lombok.experimental.Delegate;

import java.util.Date;

public class RadioAlarm implements Radio, Alarm {
    @Delegate
    private Alarm alarm = new AlarmImpl();
    @Delegate
    private Radio radio = new RadioImpl();
}
