//Classe Abstrada
public abstract class CarroBase {
    private String modelo;
    private String marca;
    private double preco;

    public CarroBase(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return  marca;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void exibirInfo();
}
