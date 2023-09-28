package com.aimi.conversordemonedas.igu;

import java.awt.Color;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;

import com.aimi.conversordemonedas.logica.Conversor;

public class Pantalla extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labeltitulo, labelconvertir, labelresultado;
	private JButton botondinero;
	private JTextField textodinero, textoresultado;
	private JComboBox<String> tipodecambio;
	private Conversor conversor;
	
	public Pantalla(){
		//configurando texto
		setLayout(null);
		labeltitulo = new JLabel("Conversor de Monedas ");
		labeltitulo.setBounds(125, 20,250,10);//x, y, ancho, alto
		labeltitulo.setForeground(Color.BLACK);
		add(labeltitulo);
		
		labelconvertir = new JLabel("Escribe la cantidad a convertir: ");
		labelconvertir.setBounds(10, 50,250,10);//x, y, ancho, alto
		labelconvertir.setForeground(Color.BLACK);
		add(labelconvertir);
		
		labelresultado = new JLabel("Resultado: ");
		labelresultado.setBounds(10, 80,250,10);//x, y, ancho, alto
		labelresultado.setForeground(Color.BLACK);
		add(labelresultado);
		//configurando boton
		botondinero = new JButton("Convertir Dinero");
		botondinero.setBounds(125,120,150,50);
		add(botondinero);
		
		//configurando campos de texto
		textodinero = new JTextField();
		textodinero.setBounds(200, 50, 100, 20);
		add(textodinero);
		
		textoresultado = new JTextField();
		textoresultado.setBounds(100, 80, 100, 20);
		add(textoresultado);
		
		//comfigurando combo box
		tipodecambio=new JComboBox<String>();
		tipodecambio.setBounds(225, 80,100,20);//x, y, ancho, alto
		tipodecambio.addItem("DOLAR");
		tipodecambio.addItem("EURO");
		tipodecambio.addItem("YEN");
        tipodecambio.addItem("LIBRAS");
        //tipodecambio.addItem("CHELINES");
        add(tipodecambio);
        //tipodecambio.addItemListener(this);
		
		
		AccionesDeBotones();
		
		
		
	}
	
	public void AccionesDeBotones() {
		botondinero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String seleccionado=(String)tipodecambio.getSelectedItem();
            	if(textodinero.getText().isBlank() || seleccionado ==null) {
            		            		
            		JOptionPane.showMessageDialog(null, "No ha introducido la cantidad");
            		
            	}else {
            		
            		ConvertirDinero();
            	}
            	
            	
              
            }
        });
	}
	
	public void ConvertirDinero() {
		conversor = new Conversor();
		double cantidad =0;		
		
		try {
			cantidad = Integer.parseInt(textodinero.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, String
                    .format("El campo cantidad debe ser numérico", 0, Integer.MAX_VALUE));
            return;
        }
		cantidad = conversor.ConversorDeDinero(cantidad, (String)tipodecambio.getSelectedItem());
		String str;
		str = new DecimalFormat("#.00#").format(cantidad);
		textoresultado.setText(str);
	}
	

}
