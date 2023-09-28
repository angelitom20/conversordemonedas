package com.aimi.conversordemonedas.logica;

public class Conversor {
	
	public Conversor() {
		
	}
	
	public double ConversorDeDinero(double cantidad, String moneda) {
		
		double dolar = 0.056, yen = 8.43, libra = 1.74, euro = 0.054, resultado = 0;
		
		switch(moneda) {
		  case "DOLAR":
		    resultado = cantidad*dolar;
		    break;
		  case "EURO":
		    resultado = cantidad*euro;
		    break;
		  case "YEN":
		    resultado = cantidad*yen;
		    break;
		  case "LIBRAS":
		    resultado = cantidad*libra;
		    break;
		}
		
		return resultado;
		
	}
	
	

}
