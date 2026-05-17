package br.com.mramos;

public class CarrosFiat extends Carro {

    public CarrosFiat(String modelo, int anoDeFabricacao, int anoDoModelo, String localDaConcessionaria) {

        super("Fiat", modelo, anoDeFabricacao, anoDoModelo, localDaConcessionaria);

    }

    protected String condicoesDeFinanciamento() {

        return "Entrada mínima de 10% em até 36x";
    }

}