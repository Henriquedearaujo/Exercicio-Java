import java.util.List;

public class Demo {
     public static void main(String[] args) {
         GenericListCarro gerenciador = new GenericListCarro();

         // Adicionando carros
         gerenciador.adicionarCarro(new Sedan("Civic", "Honda", 120000.0));
         gerenciador.adicionarCarro(new Sedan("Accord", "Honda", 150000.0));
         gerenciador.adicionarCarro(new SUV("CR-V", "Honda", 170000.0));
         gerenciador.adicionarCarro(new Sedan("Corolla", "Toyota", 110000.0));
         gerenciador.adicionarCarro(new SUV("RAV4", "Toyota", 160000.0));



         // Exibindo informações detalhadas de todos os carros

         System.out.println("\nInformações detalhadas dos carros:");
         for (CarroBase carro : gerenciador.carros) {
             carro.exibirInfo();
         }

     }

}
