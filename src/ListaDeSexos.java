import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeSexos {

    public static void main(String[] args) {

        listas();

    }

    private static void listas() {

        Scanner s = new Scanner(System.in);
        String resposta = ("");
        String validaRetorno = ("");

        List<String> listaMasculina = new ArrayList<String>();
        List<String> listaFeminina = new ArrayList<String>();

        do {

            System.out.println("Digite o primeiro nome e sexo separado por um espaço:");
            resposta = s.nextLine();

            String[] dados = resposta.split(" ");

            if (dados.length != 2) {
                System.out.println("Informações inválidas! Digite exatamente: Nome Sexo");
                System.out.println();
                validaRetorno = "Sim";
                continue;
            }

            String nome = dados[0];
            String sexo = dados[1];

            if (
                    sexo.equalsIgnoreCase("M") ||
                            sexo.equalsIgnoreCase("Masculino") ||
                            sexo.equalsIgnoreCase("Masculina") ||
                            sexo.equalsIgnoreCase("Homem") ||
                            sexo.equalsIgnoreCase("Macho") ||
                            sexo.equalsIgnoreCase("Menino") ||
                            sexo.equalsIgnoreCase("Man") ||
                            sexo.equalsIgnoreCase("Boy")
            ) {
                listaMasculina.add(nome);

            } else if (
                    sexo.equalsIgnoreCase("F") ||
                            sexo.equalsIgnoreCase("Feminino") ||
                            sexo.equalsIgnoreCase("Feminina") ||
                            sexo.equalsIgnoreCase("Mulher") ||
                            sexo.equalsIgnoreCase("Woman") ||
                            sexo.equalsIgnoreCase("Menina") ||
                            sexo.equalsIgnoreCase("Garota")
            ) {
                listaFeminina.add(nome);

            } else {
                System.out.println("Sexo Inválido! Tente novamente");
                continue;
            }

            System.out.println();

            System.out.println("Lista de nomes masculinos atual: " + listaMasculina);
            System.out.println("Lista de nomes femininos atual: " + listaFeminina);

            System.out.println();

            System.out.println("Você deseja adicionar mais nomes na lista? (Responda com Sim ou Não)");
            validaRetorno = s.nextLine();
        } while (validaRetorno.equalsIgnoreCase("sim"));

        System.out.println("Obrigado. ");
        s.close();

    }

}
