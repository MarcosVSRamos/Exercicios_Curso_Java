package br.com.mramos;

public class RegistroDeAlunos {
    public static Notas aluno1 = new Notas();
    public static Notas aluno2 = new Notas();
    public static Notas aluno3 = new Notas();
    public static Notas aluno4 = new Notas();

    static {

        //Aluno 1
        aluno1.setAluno("Marcos Vinicius");
        aluno1.setPrimeiroBimestre(7.5);
        aluno1.setSegundoBimestre(8.0);
        aluno1.setTerceiroBimestre(5.5);
        aluno1.setQuartoBimestre(9.0);

        //Aluno 2
        aluno2.setAluno("Ana Julia");
        aluno2.setPrimeiroBimestre(5.5);
        aluno2.setSegundoBimestre(10.0);
        aluno2.setTerceiroBimestre(8.5);
        aluno2.setQuartoBimestre(5.0);

        //Aluno 3
        aluno3.setAluno("Paulo Freire");
        aluno3.setPrimeiroBimestre(3.5);
        aluno3.setSegundoBimestre(8.0);
        aluno3.setTerceiroBimestre(9.5);
        aluno3.setQuartoBimestre(6.0);

        //Aluno 4
        aluno4.setAluno("Julio Ramos");
        aluno4.setPrimeiroBimestre(2.5);
        aluno4.setSegundoBimestre(6.0);
        aluno4.setTerceiroBimestre(6.5);
        aluno4.setQuartoBimestre(7.0);

    }

}
