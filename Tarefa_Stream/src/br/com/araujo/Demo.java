package br.com.araujo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // Lista de pessoas em formato "nome,genero"
        String pessoasStr = "Cristiane,Feminino;Henrique,Masculino;Maria,Feminino;Israel,Masculino;Sheila,Feminino";

        // Converter a string em uma lista de objetos br.com.araujo.Pessoa
        List<Pessoa> pessoas = Arrays.stream(pessoasStr.split(";"))
                .map(pessoaStr -> {
                    String[] atributos = pessoaStr.split(",");
                    return new Pessoa(atributos[0], atributos[1]);
                })
                .collect(Collectors.toList());

        // Filtrar apenas as pessoas do gênero feminino
        List<Pessoa> feminino = pessoas.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        // Imprimir a lista de pessoas do gênero feminino
        System.out.println("\nLista de pessoas do gênero feminino:");
        feminino.forEach(System.out::println);
    }
}
