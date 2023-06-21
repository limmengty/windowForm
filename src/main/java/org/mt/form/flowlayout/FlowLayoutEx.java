package org.mt.form.flowlayout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    JLabel lbName = new JLabel("Name:");
    JButton btnOk = new JButton("OK");
    JButton bntCancel = new JButton("Cancel");
    public FlowLayoutEx(){
        setLayout(new BorderLayout());
        add(lbName, BorderLayout.CENTER);


    }
    public static void main(String[] arg){
        new FlowLayoutEx();
    }
}
