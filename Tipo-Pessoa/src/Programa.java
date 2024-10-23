public class Programa {
    public static void main(String[] args) {
        PessoaFisica pf = new 
        PessoaFisica("Henrique Araujo ", "Rua A, 123", "123.456.789-00");
        PessoaJuridica pj = new 
        PessoaJuridica("Empresa XYZ", "Rua A, 321", "12.345.678/0001-99");

        pf.mostrarInformacoes();
        System.out.println();
        pj.mostrarInformacoes();
    }
}
