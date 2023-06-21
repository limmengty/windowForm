package org.mt.form.grid;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {


    JButton[] Jbtn = new JButton[12];

    public GridLayoutEx(){
        setLayout(new GridLayout(3,4, 10,10));
          for (int i =0; i<Jbtn.length; i++){
              Jbtn[i] = new JButton("" +i);
              add(Jbtn[i]);
          }


        setBounds(500,200,600,400);
        setVisible(true);
    }
    public static void main(String[] arg){
        new GridLayoutEx();
    }
}
