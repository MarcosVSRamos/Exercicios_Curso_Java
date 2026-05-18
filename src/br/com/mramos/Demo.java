package br.com.mramos;

public class Demo {

    public static void main(String[] args) {

        Class<ClasseComAnotacao> clazz = ClasseComAnotacao.class;

        Tabela tabela = clazz.getAnnotation(Tabela.class);

        if (tabela != null) {

            System.out.println(tabela.value());

        }

    }

}
