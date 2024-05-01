package model;

public class bhImposto implements ImpostoCalculavel {
	public double calcularImposto(Imovel imovel) {
        return imovel.getAreaTotal() * 7 + imovel.getNumeroQuartos() * 4;
    }

}
