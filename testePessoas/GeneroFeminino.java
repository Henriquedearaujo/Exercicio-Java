import br.com.araujo.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneroFeminino {

    @Test
    public void generoFeminino() {
        String pessoasStr = "Cristiane,Feminino;Henrique,Masculino;Maria,Feminino;Israel,Masculino;Sheila,Feminino";

        List<Pessoa> pessoas = Arrays.stream(pessoasStr.split(";"))
                .map(pessoaStr -> {
                    String[] atributos = pessoaStr.split(",");
                    return new Pessoa(atributos[0], atributos[1]);
                })
                .collect(Collectors.toList());

        List<Pessoa> feminino = pessoas.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        // Verificar se o tamanho da lista está correto
        assertEquals(3, feminino.size());

        // Verificar se todos os elementos na lista são do gênero feminino
        for (Pessoa pessoa : feminino) {
            assertEquals("Feminino", pessoa.getGenero());
        }

        // Alternativamente, você pode usar um asserção que verifica a lista diretamente
        assertTrue(feminino.stream()
                .allMatch(p -> p.getGenero()
                        .equalsIgnoreCase("Feminino")));

        // Verificar se os nomes estão na lista
        List<String> nomesFemininos = feminino.stream()
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        assertTrue(nomesFemininos.containsAll(Arrays.asList("Cristiane", "Maria", "Sheila")));

    }
}
