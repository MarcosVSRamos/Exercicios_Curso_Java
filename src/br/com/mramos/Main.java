package br.com.mramos;

public class Main {

    public static void main (String[] args){

        long variavelPrimitiva = 123456789;

        System.out.println();

        System.out.println("Variavel Primitiva: " + variavelPrimitiva);

        System.out.println();

        Long variavelWraper = Long.valueOf(variavelPrimitiva);

        System.out.println("Variavel Wraper convertida: " + variavelWraper);
    }

}
