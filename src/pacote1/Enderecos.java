package pacote1;

/**
 * @author Marcos
 *
 * @class br.com.mramos.pacote1.Enderecos
 *
 * @version 1.0
 */

public class Enderecos {

    public  static  Casa casa1 = new Casa();
    public  static  Casa casa2 = new Casa();

    static {

        //Definindo casas 1 e 2
        casa1.setProprietario("Marcos");
        casa1.setNumero(123);
        casa1.setBairro("Bairro1");
        casa1.setRua("Rua1");

        casa2.setProprietario("Ramos");
        casa2.setNumero(321);
        casa2.setBairro("Bairro2");
        casa2.setRua("Rua2");
    }

};
