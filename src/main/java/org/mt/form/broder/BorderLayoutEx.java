package org.mt.form.broder;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {


    JButton[] Jbtn = new JButton[12];

    public BorderLayoutEx(){
        setLayout(new BorderLayout());
        for (int i =0; i<Jbtn.length; i++){
            Jbtn[i] = new JButton("" +i);
            add(Jbtn[i]);
        }

        setLayout(new BorderLayout());
        add(Jbtn[0], BorderLayout.CENTER);
        add(Jbtn[1], BorderLayout.NORTH);
        add(Jbtn[2], BorderLayout.SOUTH);
        add(Jbtn[3], BorderLayout.WEST);
        add(Jbtn[4], BorderLayout.EAST);
        setBounds(500,200,600,400);
        setVisible(true);
    }
    public static void main(String[] arg){
          new BorderLayoutEx();// you are is borderlayout have center, north, south, west ,  east
    }
}
