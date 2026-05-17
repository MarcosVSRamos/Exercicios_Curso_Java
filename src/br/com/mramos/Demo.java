package br.com.mramos;

import java.util.List;

public class Demo {

    public static void main (String[] args) {

        System.out.println();

        List<Carro> listaFiat = CatalogoDeCarros.criarLista();

        for (Carro carro : listaFiat) {
            System.out.println(carro);
        }

        System.out.println();

        List<Carro> listaChevrolet = CatalogoDeCarros.criarListaChevrolet();

        for (Carro carro : listaChevrolet) {
            System.out.println(carro);
        }

    }

}
