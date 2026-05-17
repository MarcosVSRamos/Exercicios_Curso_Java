package br.com.mramos;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeCarros {

    public static List<Carro> criarLista() {

        List<Carro> carrosFiat = new ArrayList<>();

        carrosFiat.add(new CarrosFiat(
           "Uno",
           2012,
           2013,
                "Fiat Campo Grande"
        ));

        carrosFiat.add(new CarrosFiat(
                "Argo",
                2022,
                2022,
                "Fiat Campo Grande"
        ));

        carrosFiat.add(new CarrosFiat(
                "Toro",
                2019,
                2020,
                "Fiat Campo Grande"
        ));
        return carrosFiat;
    }

    public static List<Carro> criarListaChevrolet() {

        List<Carro> carrosChevrolet = new ArrayList<>();

        carrosChevrolet.add(new CarrosChevrolet(
                "Montana",
                2008,
                2009,
                "Chevrolet Dourados"
        ));

        carrosChevrolet.add(new CarrosChevrolet(
                "S-10",
                2025,
                2025,
                "Chevrolet Dourados"
        ));

        carrosChevrolet.add(new CarrosChevrolet(
                "Celta",
                2010,
                2010,
                "Chevrolet Dourados"
        ));

        return carrosChevrolet;
    }


}
