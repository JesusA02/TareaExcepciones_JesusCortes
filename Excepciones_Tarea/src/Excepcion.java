import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.event.*;

public class Excepcion implements ActionListener{
    JFrame ventana;

    JButton boton1;
    JButton boton2;
    JButton boton3;

    JPanel panelBotones;

    public Excepcion(){
        ventana = new JFrame("Manejo de Excepciones");
        //ventana.setSize(1000, 1000);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        agregarComponentes();
        ventana.pack();
        ventana.setVisible(true);
    }

    private void agregarComponentes(){
        boton1 = new JButton("Primero");
        boton1.addActionListener(this);
        boton2 = new JButton("Segundo");
        boton2.addActionListener(this);
        boton3 = new JButton("Tercero");
        boton3.addActionListener(this);

        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 1));

        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);

        ventana.add(panelBotones, BorderLayout.CENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int contador = 0;
        while(contador == 3){
            try{
                if(e.getSource().equals(boton1)){
                    contador +=1;
                    System.out.println("Se precionó el  primer boton ");
                    if(e.getSource().equals(boton2)){
                        contador +=1;
                        System.out.println("Se precionó el segundo boton");

                        if(e.getSource().equals(boton3)){
                            contador +=1;
                            System.out.println("Se precionó el tercer boton");
                        }
                    }
                }
            }
            catch(Exception a){
                JOptionPane.showMessageDialog(ventana, "Presionó el boton incorrecto");
            }
    }
        
    }

}