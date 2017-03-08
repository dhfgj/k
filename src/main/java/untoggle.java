package main.java;

/**
 * Created by SiyuanZeng's on 9/5/2016.
 */
import javax.swing.*;
import java.awt.*;

import static javax.swing.GroupLayout.Alignment.*;


//google isa dead


public class untoggle {
    public static ButtonGroup bg = new ButtonGroup();

    public static JToggleButton btn5 = new JToggleButton("sho");
    public static JToggleButton btn6 = new JToggleButton("add");

    public static void main(String[] args) {
//        new untoggle();
    }

    public untoggle(JFrame frame, JPanel panel, JTextArea textArea, JLabel label, Component scroll) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
// MEESSY VS ORganized there are the good thing and bad things organized and disorganized there are different ways of thinking one is logincal thetohter i s visual
                bg.add(btn5);
                bg.add(btn6);
                Container contentPane = frame.getContentPane();


                GroupLayout groupLayout = new GroupLayout(contentPane);
                groupLayout.setAutoCreateGaps(true);
                groupLayout.setAutoCreateContainerGaps(true);
                contentPane.setLayout(groupLayout);

                panel.add(scroll);
                groupLayout.setHorizontalGroup(groupLayout
                        .createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(LEADING).addComponent(label))
                        .addGroup(groupLayout.createParallelGroup(TRAILING).addComponent(btn5).addComponent(btn6)
.addGroup(groupLayout.createParallelGroup(TRAILING).addComponent(panel))

                        ));
                groupLayout.setVerticalGroup(groupLayout
                        .createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(label))
                        .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(btn5))
                        .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(btn6))
                        .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(panel)));

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}