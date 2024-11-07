
@Tabela(value = "Tabela")

public class NomeTabela {
    @Tabela(value = "tabela")
    private String nome;

    public NomeTabela(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
