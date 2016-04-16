package br.gov.unipe;

public class IMCExibe {
	
    public void exibirIMC (double peso, double altura){
		
		IMCCalculo imcCalculo = new IMCCalculo();
		
		System.out.println("IMC: " +  imcCalculo.calcularIMC (peso, altura));
	}
}
