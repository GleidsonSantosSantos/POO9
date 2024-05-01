package model;

public class PTImposto implements ImpostoCalculavel {
	   public double calcularImposto(Imovel imovel) {
	        if (imovel.getAreaGaragem() > 0) {
	            return imovel.getAreaTotal() * 7.5 + imovel.getAreaGaragem() * 2.5;
	        } else {
	            return imovel.getAreaTotal() * 8;
	        }
	    }
	}

