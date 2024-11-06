public class Sedan extends CarroBase {
    public Sedan(String modelo, String marca, double preco) {
        super(modelo, marca, preco);
    }
    @Override
    public void exibirInfo() {
        System.out.println("Marca " + getMarca() + ", Modelo " + getModelo() + ", Preço: R$ " + getPreco());
    }
}
