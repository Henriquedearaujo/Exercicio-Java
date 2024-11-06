public class SUV extends CarroBase {
    public SUV(String modelo, String marca, double preco) {
        super(modelo, marca, preco);
    }
    @Override
    public void exibirInfo() {
        System.out.println(" Marca " + getMarca() + ", Modelo " + getModelo() + ", Preço: R$ " + getPreco());
    }
}
