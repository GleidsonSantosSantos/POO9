package model;

public class SPImposto implements ImpostoCalculavel {
	 public double calcularImposto(Imovel imovel) {
	        return imovel.getAreaTotal() * 10 + imovel.getNumeroComodos() * 2;
	    }

}
