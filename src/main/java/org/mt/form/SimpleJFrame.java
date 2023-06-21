package org.mt.form;
import javax.swing.*;
import java.awt.*;

public class SimpleJFrame  extends JFrame {
    JTextField tfName = new JTextField("10", 10);
    JButton ok = new JButton("Ok");
    JLabel name = new JLabel("Name:");
    public SimpleJFrame(){

        JPanel panel = new JPanel(new FlowLayout());
        setTitle("Simple JFrame");
        setLayout(new FlowLayout());//layout mannger12
        panel.add(name);
        panel.add(tfName);//add is a method for contianer
        panel.add(ok);
        add(panel);
        panel.setBackground(Color.BLUE);
        setBounds(500, 200, 500, 350); // set display
        setVisible(true);//show the window


    }
    public static void main(String[] arg){
        SimpleJFrame frame = new SimpleJFrame();
    }
}
