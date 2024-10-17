/**
 * @author henrique.araujo
 */
public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    
    /** 
     * Método principal para testar a classe
     * @param args
     */
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", "Preto", 2022);
        meuCarro.mostrarInformacoes();
    }
    
        // Construtor
        public Carro(String marca, String modelo, String cor, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.cor = cor;
            this.ano = ano;
        }
    
    /**
     * @return retorna os atributos do carro
     */
        public void mostrarInformacoes() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Cor: " + cor);
            System.out.println("Ano: " + ano);
        }
    
}
