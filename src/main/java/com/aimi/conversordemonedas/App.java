package com.aimi.conversordemonedas;

import com.aimi.conversordemonedas.igu.Pantalla;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Pantalla pantalla;
	
    public static void main( String[] args )
    {
        pantalla = new Pantalla();
        pantalla.setBounds(0,0,400,350);//0,0 pone en el centro la ventana
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        pantalla.setResizable(false);//no deja modificar el tamaño de mi interfaz
    }
}
