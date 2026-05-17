package br.com.mramos;

public class CarrosChevrolet extends Carro {

    public CarrosChevrolet(String modelo, int anoDeFabricacao, int anoDoModelo, String localDaConcessionaria) {

        super("Chevrolet", modelo, anoDeFabricacao, anoDoModelo, localDaConcessionaria);

    }

    protected String condicoesDeFinanciamento() {

        return "Entrada mínima de 20% em até 48x";
    }

}
