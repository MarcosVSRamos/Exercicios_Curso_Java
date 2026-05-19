package br.com.mramos.testes;

import br.com.mramos.streams.Pessoa;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class TestListaTest {

    @Test
    public void validaLista() {

        List<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(new Pessoa("Marcos", "M"));
        listaPessoas.add(new Pessoa("Carlos", "M"));
        listaPessoas.add(new Pessoa("Julia", "F"));
        listaPessoas.add(new Pessoa("Amanda", "F"));

        List<Pessoa> homens = listaPessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("M"))
                .collect(Collectors.toList());

        List<Pessoa> mulheres = listaPessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        boolean homensValidos = homens.stream()
                .allMatch(p -> p.getSexo().equalsIgnoreCase("M"));

        boolean mulheresValidas = mulheres.stream()
                .allMatch(p -> p.getSexo().equalsIgnoreCase("F"));

        assertTrue(homensValidos);
        assertTrue(mulheresValidas);

    }

}