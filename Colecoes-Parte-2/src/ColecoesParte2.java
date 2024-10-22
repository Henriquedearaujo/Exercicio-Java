import java.util.ArrayList;
import java.util.Scanner;

public class ColecoesParte2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();
        
        String continuar = "s";
        
        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome e o sexo (Exemplo: Pedro,M ou Milena,F ): ");
            String entrada = s.nextLine();
            
            // Separar os valores usando o método split
            String[] dados = entrada.split(",");
            String nome = dados[0];
            String sexo = dados[1];
            
            if (sexo.equalsIgnoreCase("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, use 'M' para Masculino ou 'F' para Feminino.");
            }
            
            System.out.print("Deseja adicionar mais uma pessoa? (s/n): ");
            continuar = s.nextLine();
        }
        
        System.out.println("\nGrupo Masculino:");
        for (String nome : grupoMasculino) {
            System.out.println(nome);
        }
        
        System.out.println("\nGrupo Feminino:");
        for (String nome : grupoFeminino) {
            System.out.println(nome);
        }
        
        s.close();
        
    }
}
