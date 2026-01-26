public class Registos {

    public static void registros() {

        System.out.println("**************Lista de CPFs cadastrados no sistema**************");
        System.out.println();

        PessoaFisica pessoaFisica1 = new PessoaFisica();

        pessoaFisica1.setCpf("083.555.666-98");
        pessoaFisica1.setNome("Marcos");
        pessoaFisica1.setNaturalidade("Dourados - MS");
        pessoaFisica1.setDataDeNascimento("03/11/2003");
        pessoaFisica1.setCodigoDeOcupacaoNoSistema(1);
        System.out.println(pessoaFisica1.getNome() + "; CPF: " + pessoaFisica1.getCpf() + "; Natural de: " + pessoaFisica1.getNaturalidade() + "; Data de nascimento: " + pessoaFisica1.getDataDeNascimento());

        System.out.println();

        PessoaFisica pessoaFisica2 = new PessoaFisica();

        pessoaFisica2.setCpf("083.555.666-98");
        pessoaFisica2.setNome("Antonio");
        pessoaFisica2.setNaturalidade("Xaxim - MS");
        pessoaFisica2.setDataDeNascimento("03/11/2000");
        pessoaFisica2.setCodigoDeOcupacaoNoSistema(2);
        System.out.println(pessoaFisica2.getNome() + "; CPF: " + pessoaFisica2.getCpf() + "; Natural de: " + pessoaFisica2.getNaturalidade() + "; Data de nascimento: " + pessoaFisica2.getDataDeNascimento());

        System.out.println();

        PessoaFisica pessoaFisica3 = new PessoaFisica();

        pessoaFisica3.setCpf("083.555.666-98");
        pessoaFisica3.setNome("Vinicius");
        pessoaFisica3.setNaturalidade("Campo Grande - MS");
        pessoaFisica3.setDataDeNascimento("22/11/2008");
        pessoaFisica3.setCodigoDeOcupacaoNoSistema(3);
        System.out.println(pessoaFisica3.getNome() + "; CPF: " + pessoaFisica3.getCpf() + "; Natural de: " + pessoaFisica3.getNaturalidade() + "; Data de nascimento: " + pessoaFisica3.getDataDeNascimento());

        System.out.println();

        PessoaFisica pessoaFisica4 = new PessoaFisica();

        pessoaFisica4.setCpf("083.555.666-98");
        pessoaFisica4.setNome("Amanda");
        pessoaFisica4.setNaturalidade("Chapecó - SC");
        pessoaFisica4.setDataDeNascimento("03/02/1999");
        pessoaFisica4.setCodigoDeOcupacaoNoSistema(4);
        System.out.println(pessoaFisica4.getNome() + "; CPF: " + pessoaFisica4.getCpf() + "; Natural de: " + pessoaFisica4.getNaturalidade() + "; Data de nascimento: " + pessoaFisica4.getDataDeNascimento());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("**************Lista de CNPJs cadastradas no sistema**************");
        System.out.println();

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();

        pessoaJuridica1.setNome("Engenharia e Cia");
        pessoaJuridica1.setCnpj("18.665.254.0008-99");
        pessoaJuridica1.setEndereco("Rua Qualquer; Número 10; Caarapó - MS");
        pessoaJuridica1.setCodigoDeOcupacaoNoSistema(5);
        pessoaJuridica1.setDataDeFundacao("10/08/2021");
        System.out.println(pessoaJuridica1.getNome() + "; CNPJ: " + pessoaJuridica1.getCnpj() + "; Endereço: " + pessoaJuridica1.getEndereco() + "; Data de fundação: " + pessoaJuridica1.getDataDeFundacao());

        System.out.println();

        PessoaJuridica pessoaJuridica2 = new PessoaJuridica();

        pessoaJuridica2.setNome("Padaria e Cia");
        pessoaJuridica2.setCnpj("18.665.254.0008-99");
        pessoaJuridica2.setEndereco("Rua Qualquer; Número 10; Santos - SP");
        pessoaJuridica2.setCodigoDeOcupacaoNoSistema(6);
        pessoaJuridica2.setDataDeFundacao("10/01/2026");
        System.out.println(pessoaJuridica2.getNome() + "; CNPJ: " + pessoaJuridica2.getCnpj() + "; Endereço: " + pessoaJuridica2.getEndereco() + "; Data de fundação: " + pessoaJuridica2.getDataDeFundacao());

        System.out.println();

        PessoaJuridica pessoaJuridica3 = new PessoaJuridica();

        pessoaJuridica3.setNome("Funilaria Confiança");
        pessoaJuridica3.setCnpj("18.665.254.0008-99");
        pessoaJuridica3.setEndereco("Rua Qualquer; Número 10; Campo Grande - RJ");
        pessoaJuridica3.setCodigoDeOcupacaoNoSistema(7);
        pessoaJuridica3.setDataDeFundacao("10/01/1998");
        System.out.println(pessoaJuridica3.getNome() + "; CNPJ: " + pessoaJuridica3.getCnpj() + "; Endereço: " + pessoaJuridica3.getEndereco() + "; Data de fundação: " + pessoaJuridica3.getDataDeFundacao());
    }

}
