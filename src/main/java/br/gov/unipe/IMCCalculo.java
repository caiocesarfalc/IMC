package br.gov.unipe;

public class IMCCalculo {
	
    public double calcularIMC (double peso, double altura){
		
		double imc = peso / (altura * altura);
		
		return imc;
		
	}
}
