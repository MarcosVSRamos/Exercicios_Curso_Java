import java.util.Scanner;

public class ExercicioMedia {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String resposta = "";

        do {

            System.out.println("Digite o nome do aluno: ");
            String aluno = s.nextLine();

            System.out.println("Para calcularmos a média de " + aluno + ", precisamos de sua nota do primeiro bimestre: ");
            int primeiraNota = s.nextInt();

            System.out.println("Ótimo, agora digite a nota do segundo bimestre: ");
            int segundaNota = s.nextInt();

            System.out.println("Anotado, digite a terceira: ");
            int terceiraNota = s.nextInt();

            System.out.println("Por fim, nos diga a nota do ultimo bimestre: ");
            int quartaNota = s.nextInt();

            if (primeiraNota > 10 || segundaNota > 10 || terceiraNota > 10 || quartaNota > 10) {
                System.out.println("Erro: notas devem ser entre 0 e 10.");
                resposta = "Sim";
                s.nextLine();
                continue;
            }


            int mediaFinal = (primeiraNota+segundaNota+terceiraNota+quartaNota) / 4;

            if (mediaFinal<5) {
                System.out.println("Lamentamos por " + aluno + ", sua média final é " + mediaFinal + " e infelismente não passou de ano");
            } else if (mediaFinal<=6) {
                System.out.println(aluno + " não passou, porém ainda pode realizar a recuperação! Sua média é " + mediaFinal);
            } else if (mediaFinal<=9) {
                System.out.println("Felicidades a " + aluno + ", Com a média de " + mediaFinal + " conseguiu a aprovação e passou de ano!");
            } else if (mediaFinal==10) {
                System.out.println("Uau!! " + aluno + " Tirou a media " + mediaFinal + " parabéns pela exelência, será um destaque do ano! Passou de ano.");
            } if (mediaFinal>10) {
                System.out.println("Houve algum equivoco ao nos informar as notas, lembresse que cada nota bimestral só vai até 10, tente novamente!");
                continue;
            }

            s.nextLine();

            System.out.println("Você deseja consultar a media de outro aluno? (Responda com Sim ou Não)");
            resposta = s.nextLine();
        } while (resposta.equalsIgnoreCase("Sim"));

        System.out.println("Obrigado. ");
        s.close();

    }

}
