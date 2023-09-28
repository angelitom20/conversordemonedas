package com.aimi.conversordemonedas.logica;

public class Conversor {
	
	public Conversor() {
		
	}
	
	public double ConversorDeDinero(double cantidad, String moneda) {
		
		double dolar = 0.056, yen = 8.43, libra = 0.047, euro = 0.054, won = 76.57, resultado = 0;
		
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
		  case "WON":
			resultado = cantidad*won;
		}
		
		return resultado;
		
	}

	public double ConversorDeDinero2(double cantidad, String selectedItem) {
		// TODO Auto-generated method stub
double dolar = 0.056, yen = 8.43, libra = 0.047, euro = 0.054, won = 76.57, resultado = 0;
		
		switch(selectedItem) {
		  case "DOLAR":
		    resultado = cantidad/dolar;
		    break;
		  case "EURO":
		    resultado = cantidad/euro;
		    break;
		  case "YEN":
		    resultado = cantidad/yen;
		    break;
		  case "LIBRAS":
		    resultado =cantidad/libra;
		    break;
		  case "WON":
			resultado = cantidad/won;
			break;
		}
		
		return resultado;
	}
	
	

}
