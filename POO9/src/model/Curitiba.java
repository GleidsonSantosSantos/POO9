package model;

public class Curitiba implements ImpostoCalculavel {
	
	 public double calcularImposto(Imovel imovel) {
	        double imposto = imovel.getAreaTotal() * 5;
	        int idade = imovel.getIdade();

	        if (idade > 50) {
	            imposto += idade * 3;
	        } else if (idade < 20) {
	            imposto += idade * 2;
	        } else {
	            imposto += idade * 2.5;
	        }
	        
	        return imposto;
	    }

}
