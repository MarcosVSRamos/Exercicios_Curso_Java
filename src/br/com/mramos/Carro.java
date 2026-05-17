package br.com.mramos;

public abstract class Carro {

    private String marca;
    private String modelo;
    private int anoDeFabricacao;
    private int anoDoModelo;
    private String localDaConcessionaria;

    public Carro(String marca, String modelo, int anoDeFabricacao, int anoDoModelo, String localDaConcessionaria) {

        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.anoDoModelo = anoDoModelo;
        this.localDaConcessionaria = localDaConcessionaria;

    }

        protected abstract String condicoesDeFinanciamento();

        public String toString() {
        return "Marca: " + marca +
                " | Modelo: " + modelo +
                " | Fabricação: " + anoDeFabricacao +
                " | Modelo Ano: " + anoDoModelo +
                " | Concessionária: " + localDaConcessionaria +
                " | Condições de Financiamento: " + condicoesDeFinanciamento();
        }


}
