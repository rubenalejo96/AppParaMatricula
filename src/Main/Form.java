package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame{

    JPanel panelMain;
    private JButton[] botones = new JButton[82];
    private JButton A0;
    private JButton A5;
    private JButton A4;
    private JButton A3;
    private JButton A2;
    public JButton A1;
    private JLabel primerCiclo;
    private JButton A6;
    private JButton A7;
    private JButton A8;
    private JButton A9;
    private JButton A10;
    private JButton A11;
    private JButton A12;
    private JButton A13;
    private JButton A14;
    private JButton A15;
    private JButton A16;
    private JButton A17;
    private JButton limpiarButton;
    private JButton A18;
    private JButton A19;
    private JButton A20;
    private JButton A21;
    private JButton A22;
    private JButton A23;
    private JButton A24;
    private JButton A25;
    private JButton A26;
    private JButton A27;
    private JButton A28;
    private JButton A29;
    private JButton A30;
    private JButton A31;
    private JButton A32;
    private JButton A33;
    private JButton A34;
    private JButton A35;
    private JButton A36;
    private JButton A37;
    private JButton A38;
    private JButton A39;
    private JButton A40;
    private JButton A41;
    private JButton A42;
    private JButton A43;
    private JButton A44;
    private JButton A45;
    private JButton A46;
    private JButton A47;
    private JButton A48;
    private JButton A49;
    private JButton A50;
    private JButton A51;
    private JButton A52;
    private JButton A53;
    private JButton A54;
    private JButton A55;
    private JButton A56;
    private JButton A57;
    private JButton A58;
    private JButton A59;
    private JButton A60;
    private JButton A61;
    private JButton A62;
    private JButton A63;
    private JButton A64;
    private JButton A65;
    private JButton A66;
    private JButton A67;
    private JButton A68;
    private JButton A69;
    private JButton A70;
    private JButton A71;
    private JButton A72;
    private JButton A73;
    private JButton A74;
    private JButton A75;
    private JButton A76;
    private JButton A77;
    private JButton A78;
    private JButton A79;
    private JButton A80;
    private JButton A81;
    private JSpinner CreditosColocados;
    private JButton bloquearButton;
    public JScrollPane scroll;

    public Color colores[] = new Color[82];

    public Form() {
        botones[0]= A0;
        botones[1]= A1;
        botones[2]= A2;
        botones[3]= A3;
        botones[4]= A4;
        botones[5]= A5;
        botones[6]= A6;
        botones[7]= A7;
        botones[8]= A8;
        botones[9]= A9;
        botones[10]= A10;
        botones[11]= A11;
        botones[12]= A12;
        botones[13]= A13;
        botones[14]= A14;
        botones[15]= A15;
        botones[16]= A16;
        botones[17]= A17;
        botones[18]= A18;
        botones[19]= A19;
        botones[20]= A20;
        botones[21]= A21;
        botones[22]= A22;
        botones[23]= A23;
        botones[24]= A24;
        botones[25]= A25;
        botones[26]= A26;
        botones[27]= A27;
        botones[28]= A28;
        botones[29]= A29;
        botones[30]= A30;
        botones[31]= A31;
        botones[32]= A32;
        botones[33]= A33;
        botones[34]= A34;
        botones[35]= A35;
        botones[36]= A36;
        botones[37]= A37;
        botones[38]= A38;
        botones[39]= A39;
        botones[40]= A40;
        botones[41]= A41;
        botones[42]= A42;
        botones[43]= A43;
        botones[44]= A44;
        botones[45]= A45;
        botones[46]= A46;
        botones[47]= A47;
        botones[48]= A48;
        botones[49]= A49;
        botones[50]= A50;
        botones[51]= A51;
        botones[52]= A52;
        botones[53]= A53;
        botones[54]= A54;
        botones[55]= A55;
        botones[56]= A56;
        botones[57]= A57;
        botones[58]= A58;
        botones[59]= A59;
        botones[60]= A60;
        botones[61]= A61;
        botones[62]= A62;
        botones[63]= A63;
        botones[64]= A64;
        botones[65]= A65;
        botones[66]= A66;
        botones[67]= A67;
        botones[68]= A68;
        botones[69]= A69;
        botones[70]= A70;
        botones[71]= A71;
        botones[72]= A72;
        botones[73]= A73;
        botones[74]= A74;
        botones[75]= A75;
        botones[76]= A76;
        botones[77]= A77;
        botones[78]= A78;
        botones[79]= A79;
        botones[80]= A80;
        botones[81]= A81;


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        panelMain.setLayout(null);
        scroll = new JScrollPane(panelMain);
//        panelMain.setPreferredSize(new Dimension(2200,430));
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        add(scroll);

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < colores.length; i++) {
                    colores[i] = UIManager.getColor("Button.background");
                }
                if(bloquearButton.getText()=="Desbloquear"){
                    bloquearButton.setText("Bloquear");
                }

                limpiarBoton();
                for(int i = 1; i< botones.length; i++){
                    if(i<10 || i==11||i ==21|| i==32|| i==33|| i==39|| i==41|| i==47){
                        botones[i].setEnabled(true);
                    }else{
                        botones[i].setEnabled(false);
                    }

                }

                for(int i=1; i<botones.length; i++){
                    botones[i].setBackground(colores[i]);
                }
            }
        });

        A1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A1, 1, 3);

                esRequisitoDe(A1, A15, A20);

            }
        });

        A2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A2, 2, 2);

                esRequisitoDe(A2, A18);
            }
        });

        A3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A3, 3, 3);
            }
        });


        A4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A4, 4, 3);

                esRequisitoDe(A4, A10, A13);
            }
        });



        A5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A5, 5, 1);

                esRequisitoDe(A5, A14);
            }
        });


        A6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A6, 6, 1);
            }
        });


        A7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A7, 7, 3);

                esRequisitoDe(A7, A12, A16);
            }
        });


        A8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A8, 8, 2);
            }
        });


        A9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A9, 9, 3);

                esRequisitoDe(A9, A17);
            }
        });


        A10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A10, 10, 2);
            }
        });


        A11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A11, 11, 2);
            }
        });


        A12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A12, 12, 3);

                esRequisitoDe(A12, A19);
            }
        });


        A13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A13, 13, 3);
            }
        });


        A14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A14, 14, 1);

                esRequisitoDe(A14, A22);
            }
        });


        A15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A15, 15, 3);

                esRequisitoDe(A15, A23, A29);
            }
        });


        A16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A16, 16, 3);

                esRequisitoDe(A16, A24);
            }
        });


        A17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A17, 17, 3);

                esRequisitoDe(A17, A25);
            }
        });


        A18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A18, 18, 3);
            }
        });


        A19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A19, 19, 3);
            }
        });


        A20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A20, 20, 3);

                esRequisitoDe(A20, A31);
            }
        });

        A21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A21, 21, 2);
            }
        });


        A22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A22, 22, 1);
            }
        });


        A23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A23, 23, 3);

                esRequisitoDe(A23, A26);
            }
        });


        A24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A24, 24, 3);

                esRequisitoDe(A24, A28);
            }
        });


        A25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A25, 25, 3);

                esRequisitoDe(A25, A30, A27);
            }
        });


        A26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A26, 26, 3);
            }
        });


        A27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A27, 27, 3);
            }
        });


        A28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A28, 28, 3);

                esRequisitoDe(A28, A34, A36);
            }
        });


        A29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A29, 29, 3);

                esRequisitoDe(A29, A35, A37);
            }
        });


        A30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A30, 30, 3);

                esRequisitoDe(A30, A38);
            }
        });


        A31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A31, 31, 3);

                esRequisitoDe(A31, A40);
            }
        });


        A32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cambiarColor(A32, 32, 2);
            }
        });

        A33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cambiarColor(A33, 33, 2);
            }
        });


        A34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A34, 34, 3);

                esRequisitoDe(A34, A42);
            }
        });


        A35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cambiarColor(A35, 35, 3);
            }
        });


        A36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A36, 36, 3);

                esRequisitoDe(A36, A44);
            }
        });


        A37.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A37, 37, 3);

                esRequisitoDe(A37, A43, A45);
            }
        });


        A38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A38, 38, 3);

                esRequisitoDe(A38, A46);
            }
        });

        A39.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cambiarColor(A39, 39, 2);
            }
        });


        A40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A40, 40, 3);

                esRequisitoDe(A40, A48);
            }
        });

        A41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A41, 41, 2);

                esRequisitoDe(A41, A49);
            }
        });

        A42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A42, 42, 3);

                esRequisitoDe(A42, A50);
            }
        });

        A43.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A43, 43, 3);
                esRequisitoCon(A43,A50,A58);
                esRequisitoDe(A43, A51);
            }
        });

        A44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A44, 44, 3);

                esRequisitoDe(A44, A52);
            }
        });

        A45.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A45, 45, 3);

                esRequisitoDe(A45, A53);
            }
        });

        A46.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A46, 46, 3);

                esRequisitoDe(A46, A54);
            }
        });

        A47.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A47, 47, 3);

                esRequisitoDe(A47, A55);
            }
        });

        A48.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A48, 48, 3);

                esRequisitoDe(A48, A56);
            }
        });

        A49.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A49, 49, 2);

                esRequisitoDe(A49, A57);
            }
        });

        A50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A50, 50, 3);

                esRequisitoCon(A50,A43,A58);
            }
        });

        A51.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A51, 51, 3);
            }
        });

        A52.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A52, 52, 3);

                esRequisitoDe(A52, A60);
            }
        });

        A53.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A53, 53, 3);

                esRequisitoDe(A53,A59,A61,A62);
            }
        });

        A54.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A54, 54, 3);
            }
        });

        A55.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A55, 55, 3);

                esRequisitoDe(A55, A63);
            }
        });

        A56.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A56, 56, 2);

                esRequisitoDe(A56, A64);
            }
        });

        A57.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A57, 57, 2);

                esRequisitoDe(A57, A65);
            }
        });

        A58.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A58, 58, 3);

                esRequisitoDe(A58, A73);
            }
        });

        A59.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A59, 59, 3);

                esRequisitoDe(A59, A67);
            }
        });

        A60.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A60, 60, 3);

                esRequisitoDe(A60, A66, A68);
            }
        });

        A61.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A61, 61, 3);
            }
        });

        A62.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A62, 62, 3);

                esRequisitoDe(A62, A70);
            }
        });

        A63.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A63, 63, 3);

                esRequisitoDe(A63, A71);
            }
        });

        A64.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A64, 64, 2);

                esRequisitoDe(A64, A72, A69);
            }
        });

        A65.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A65, 65, 2);
            }
        });

        A66.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A66, 66, 2);

                esRequisitoDe(A66, A74, A81);
            }
        });

        A67.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A67, 67, 3);

                esRequisitoDe(A67, A79);
            }
        });

        A68.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A68, 68, 2);

                esRequisitoDe(A68, A75, A76);
            }
        });

        A69.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A69, 69, 2);

                esRequisitoDe(A69, A77);
            }
        });

        A70.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A70, 70, 2);
            }
        });

        A71.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A71, 71, 2);
            }
        });

        A72.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A72, 72, 3);

                esRequisitoDe(A72, A78, A80);
            }
        });

        A73.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A73, 73, 2);
            }
        });

        A74.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A74, 74, 2);
            }
        });

        A75.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A75, 75, 2);
            }
        });

        A76.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A76, 76, 2);
            }
        });

        A77.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A77, 77, 2);
            }
        });

        A78.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A78, 78, 2);
            }
        });

        A79.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A79, 79, 2);
            }
        });

        A80.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A80, 80, 2);
            }
        });

        A81.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColor(A81, 81, 4);
            }
        });

        bloquearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=1; i<botones.length; i++){
                    if (botones[i].getBackground() == Color.GREEN && bloquearButton.getText()== "Bloquear") {
                        botones[i].setEnabled(false);
                    } else if (!botones[i].isEnabled() && botones[i].getBackground() == Color.GREEN) {
                        botones[i].setEnabled(true);
                    }
                }
                bloquearBoton();
            }
        });
    }
    public void cambiarColor(JButton boton, int i, int creditos) {

        if(limpiarButton.getText().equals("Limpiar")) {
            if (botones[i].getBackground() == UIManager.getColor("Button.background") && (int) CreditosColocados.getValue() >= creditos) {
                colores[i] = Color.GREEN;
                restarCred(creditos);
            } else if (botones[i].getBackground() == UIManager.getColor("Button.background") && (int) CreditosColocados.getValue() < creditos) {
                faltanCred();
            } else {
                colores[i] = UIManager.getColor("Button.background");
                sumarCred(creditos);
            }
            boton.setBackground(colores[i]);
        }
    }

    public void bloquearBoton(){
        if(bloquearButton.getText() == "Bloquear"){
            bloquearButton.setText("Desbloquear");
            CreditosColocados.setValue(0);
        }else{
            bloquearButton.setText("Bloquear");
        }
    }

    public void limpiarBoton(){
        if(limpiarButton.getText() == "Empezar"){
            limpiarButton.setText("Limpiar");
            CreditosColocados.setValue(250);
        }else{
            limpiarButton.setText("Empezar");
            CreditosColocados.setValue(0);
        }
    }

    public void esRequisitoCon (JButton miBoton, JButton Boton2, JButton abre){
        if(limpiarButton.getText().equals("Limpiar")) {
            if (miBoton.getBackground() == Color.GREEN && Boton2.getBackground() == Color.GREEN) {
                abre.setEnabled(true);
            } else {
                abre.setEnabled(false);
            }
        }
    }

    public void esRequisitoDe (JButton miBoton, JButton abre1){
        if(limpiarButton.getText().equals("Limpiar")) {
            if (limpiarButton.getText().equals("Limpiar")) {
                if (miBoton.getBackground() == Color.GREEN) {
                    abre1.setEnabled(true);
                } else {
                    abre1.setEnabled(false);
                }
            }
        }
    }

    public void esRequisitoDe (JButton miBoton, JButton abre1, JButton abre2){
        if(limpiarButton.getText().equals("Limpiar")) {
            if (miBoton.getBackground() == Color.GREEN) {
                abre1.setEnabled(true);
                abre2.setEnabled(true);
            } else {
                abre1.setEnabled(false);
                abre2.setEnabled(false);
            }
        }
    }

    public void esRequisitoDe (JButton miBoton, JButton abre1, JButton abre2, JButton abre3){
        if(limpiarButton.getText().equals("Limpiar")) {
            if (miBoton.getBackground() == Color.GREEN) {
                abre1.setEnabled(true);
                abre2.setEnabled(true);
                abre3.setEnabled(true);
            } else {
                abre1.setEnabled(false);
                abre2.setEnabled(false);
                abre3.setEnabled(false);
            }
        }
    }

    public void restarCred (int i){
        CreditosColocados.setValue((int) CreditosColocados.getValue() - i);
    }

    public void sumarCred (int i){
        CreditosColocados.setValue((int) CreditosColocados.getValue() + i);
    }

    public void verificarCred (){
        JOptionPane.showMessageDialog(null, "!Coloca bien tus Creditos!","Alerta", JOptionPane.WARNING_MESSAGE);
    }

    public void faltanCred(){
        JOptionPane.showMessageDialog(null,"Te faltan Creditos para este Curso");
    }
}
