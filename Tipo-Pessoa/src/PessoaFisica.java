public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nPessoa Fisica");
        System.out.println("Nome : " + nome);
        System.out.println("Endereço : " + endereco);
        System.out.println("Cpf : " + cpf);
    }
}
