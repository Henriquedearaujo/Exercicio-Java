import java.util.ArrayList;
import java.util.List;

public class GenericListCarro {
    protected List<CarroBase> carros;

    public GenericListCarro() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(CarroBase carro) {
        carros.add(carro);
    }

    public List<CarroBase> obterCarrosPorMarca(String marca) {
        List<CarroBase> carrosPorMarca = new ArrayList<>();
        for ( CarroBase carro : carros) {
            if (carro.getMarca().equalsIgnoreCase(marca)) {
                carrosPorMarca.add(carro);
            }
        }
        return carrosPorMarca;
    }
}
