package annonimus_inner_class;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyStupidListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(666);
    }
}
