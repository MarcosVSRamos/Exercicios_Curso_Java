public abstract class Pessoa {

    private String nome;

    private int codigoDeOcupacaoNoSistema;

    public int getCodigoDeOcupacaoNoSistema() {
        return codigoDeOcupacaoNoSistema;
    }

    public void setCodigoDeOcupacaoNoSistema(int codigoDeOcupacaoNoSistema) {
        this.codigoDeOcupacaoNoSistema = codigoDeOcupacaoNoSistema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
