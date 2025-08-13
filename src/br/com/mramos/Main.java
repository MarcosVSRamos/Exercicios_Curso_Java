package br.com.mramos;

import pacote1.Enderecos;

/**
 * @author Marcos
 *
 * @class br.com.mramos.Main
 *
 * @params args valores do sistema
 *
 * @version 1.0
 */


public class Main {

    public  static void  main(String[] args) {

        System.out.println();

       System.out.println("Relação de endereços do sistema:");

        System.out.println();

        System.out.println("Proprietário: " + Enderecos.casa1.getProprietario());
        System.out.println("Endereço: " + Enderecos.casa1.getEndereco());

        System.out.println();

        System.out.println("Proprietário: " + Enderecos.casa2.getProprietario());
        System.out.println("Endereço: " + Enderecos.casa2.getEndereco());
    }

}
