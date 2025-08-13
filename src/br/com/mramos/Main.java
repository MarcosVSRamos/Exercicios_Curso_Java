package br.com.mramos;

/**
 * @author Marcos
 *
 * @class br.com.mramos.Main
 *
 * @params args Alunos e suas respectivas médias
 *
 * @version 1.0
 */

public class Main {
    public static  void main(String args[]){

        System.out.println();

        System.out.println("**** Cálculo de Média ****");

        System.out.println();

        System.out.println(RegistroDeAlunos.aluno1.getMedias());
        System.out.println(RegistroDeAlunos.aluno2.getMedias());
        System.out.println(RegistroDeAlunos.aluno3.getMedias());
        System.out.println(RegistroDeAlunos.aluno4.getMedias());

        System.out.println();

        System.out.println("**** Resultado de aprovação dos alunos ****");

        System.out.println();

        if (RegistroDeAlunos.aluno1.getMediaTotal() >= 6.0) {
            System.out.println("Parabéns " + RegistroDeAlunos.aluno1.getAluno() + ", você passou de ano");
        } else {
            System.out.println("Lamento " + RegistroDeAlunos.aluno1.getAluno() + ", você não passou de ano");
        }

        if (RegistroDeAlunos.aluno2.getMediaTotal() >= 6.0) {
            System.out.println("Parabéns " + RegistroDeAlunos.aluno2.getAluno() + ", você passou de ano");
        } else {
            System.out.println("Lamento " + RegistroDeAlunos.aluno2.getAluno() + ", você não passou de ano");
        }

        if (RegistroDeAlunos.aluno3.getMediaTotal() >= 6.0) {
            System.out.println("Parabéns " + RegistroDeAlunos.aluno3.getAluno() + ", você passou de ano");
        } else {
            System.out.println("Lamento " + RegistroDeAlunos.aluno3.getAluno() + ", você não passou de ano");
        }

        if (RegistroDeAlunos.aluno4.getMediaTotal() >= 6.0) {
            System.out.println("Parabéns " + RegistroDeAlunos.aluno4.getAluno() + ", você passou de ano");
        } else {
            System.out.println("Lamento " + RegistroDeAlunos.aluno4.getAluno() + ", você não passou de ano");
        }
    }

}
