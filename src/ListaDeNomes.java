import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaDeNomes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        listasNomes(s);
        listasNomesESexos(s);

        s.close();
    }

    private static void listasNomes(Scanner s) {

        String resposta = ("");
        String validaRetorno = ("");
        List<String> listaNomes = new ArrayList<>();

        do {

            System.out.println("Digite quantos nomes deseja registrar separados por vírgula: (EX: Marcos,Julia,Amanda...)");
            resposta = s.nextLine();

            String[] nomes = resposta.split(",");

            for (String nome : nomes) {
                listaNomes.add(nome.trim());
            }

            System.out.println();

            System.out.println("Você deseja adicionar mais nomes na lista? (Responda com Sim ou Não)");
            validaRetorno = s.nextLine();
        } while (validaRetorno.equalsIgnoreCase("sim"));

        Collections.sort(listaNomes);

        System.out.println("Lista de nomes em ordem alfabetica: ");
        for (String nome : listaNomes) {
            System.out.println((nome));
        }

        System.out.println();

        System.out.println("Obrigado. ");

    }

    private static void listasNomesESexos(Scanner s) {

        String validaRetorno = ("");

        List<String> listaMasculina = new ArrayList<>();
        List<String> listaFeminina = new ArrayList<>();



        do {

            boolean erro = false;


            System.out.println();

            System.out.println("********Criação de Lista separada por sexo********");
            System.out.println();

            System.out.println("Digite os nomes com sexo (EX: Amanda-F,Carlos-M,Julia-F):");
            String resposta = s.nextLine();

            String[] pessoas = resposta.split(",");

            for (String pessoa : pessoas) {
                String[] partes = pessoa.split("-");

                if(partes.length != 2){
                    System.out.println("Informações invalidas: " +pessoa);
                    erro = true;
                    break;
                }

                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    listaMasculina.add(nome);
                } else if (sexo.equals("F")) {
                    listaFeminina.add(nome);
                } else {
                    System.out.println("Sexo inválido para: " + nome);
                    erro = true;
                    break;
                }
            }

            if (erro) {
                System.out.println("A lista será deletada. Tente novamente.");
                listaMasculina.clear();
                listaFeminina.clear();
                validaRetorno = "Sim";
                continue;
            }

            System.out.println("*********Lista Masculina*********");
            listaMasculina.forEach(System.out::println);

            System.out.println();

            System.out.println("*********Lista Feminina*********");
            listaFeminina.forEach(System.out::println);

            System.out.println();
            System.out.println();

            System.out.println("Você deseja adicionar mais nomes na lista? (Responda com Sim ou Não)");
            validaRetorno = s.nextLine();

        } while (validaRetorno.equalsIgnoreCase("sim"));

        System.out.println("Obrigado. ");
        s.close();

    }
}