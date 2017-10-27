package annonimus_inner_class;

import lab1.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame {


    public ColorFrame() throws HeadlessException {
        int x = 4;

       final Counter counter = new Counter();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        JButton button = new JButton("click to change color");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.inc();
                System.out.println(counter.getX());
                getContentPane().setBackground(Color.RED);
            }
        });
        getContentPane().add(button, BorderLayout.SOUTH);
        setVisible(true);
    }
}
