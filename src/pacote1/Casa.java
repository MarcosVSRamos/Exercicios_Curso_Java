package pacote1;

/**
 * @author Marcos
 *
 * @class br.com.mramos.pacote1.Casa
 *
 * @version 1.0
 */

public class Casa {

    private String proprietario;

    private int numero;

    private String bairro;

    private String rua;


    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    //Metodo para retornar endereço completo

    public String getEndereco() {
        return  "Rua: " + rua + "; Número: " + numero + "; Bairro: " + bairro;
    }
}
