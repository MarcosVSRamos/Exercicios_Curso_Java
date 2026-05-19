package br.com.mramos.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaNomes {

    public static void listaDeNomes(Scanner s) {

        List<Pessoa> listaPessoas = new ArrayList<>();

        System.out.println("Digite os nomes e sexo separados por hífem e vírgula.");
        System.out.println("Ex: Marcos-M,Julia-F,Amanda-F...");

        String resposta = s.nextLine();

        String[] pessoas = resposta.split(",");

        for (String p : pessoas) {

            String[] dados = p.split("-");

            String nome = dados[0];
            String sexo = dados[1];

            Pessoa pessoa = new Pessoa();

            pessoa.setNome(nome);
            pessoa.setSexo(sexo);

            listaPessoas.add(pessoa);

        }

        List<Pessoa> mulheres = listaPessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("F")).collect(Collectors.toList());
        List<Pessoa> homens = listaPessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("M")).collect(Collectors.toList());

        System.out.println("\nLista Feminina:");
        mulheres.forEach( p -> System.out.println(p.getNome()));

        System.out.println("\nLista Masculina");
        homens.forEach(p -> System.out.println(p.getNome()));

    }

}
