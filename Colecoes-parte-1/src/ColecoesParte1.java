import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ColecoesParte1 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            ArrayList<String> nomes = new ArrayList<>();
    
            System.out.print("Digite os nomes separados por vírgula: ");
            String entrada = s.nextLine();
    
            // Separar os nomes usando o método split
            String[] nomesArray = entrada.split(",");
            Collections.addAll(nomes, nomesArray);
    
            // Ordenar a lista de nomes em ordem alfabética
            Collections.sort(nomes);
    
            System.out.println("\nLista de nomes ordenada:");
            for (String nome : nomes) {
                System.out.println(nome);
            }
    
            s.close();
        
        
    }
}
