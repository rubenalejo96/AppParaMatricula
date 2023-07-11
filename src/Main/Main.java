package Main;

import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {
        Form form = new Form();
        form.pack();
//        form.setContentPane(form.panelMain);
//        form.setSize(1000, 350);
        form.setVisible(true);
        form.setResizable(true);
        form.setBounds(50,50,1000,430);
    }
}

