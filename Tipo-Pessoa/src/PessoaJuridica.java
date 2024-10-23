public class PessoaJuridica extends Pessoa {
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    private String cnpj;

    public String getCpf() {
        return cnpj;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Pessoa Juridica");
        System.out.println("Nome empresa: " + nome);
        System.out.println("Endereço : " + endereco);
        System.out.println("Cnpj : " + cnpj);
    }
}
