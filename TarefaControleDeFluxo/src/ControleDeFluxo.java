import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Ler as quatro notas
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
        
        System.out.println("Digite a quarta nota:");
        double nota4 = scanner.nextDouble();
        
        double notas = (nota1 + nota2 + nota3 + nota4);
        // Calcular a média
        double media = (notas) / 4;

        //controle de fluxo
        if(media >= 7){
            System.out.println("A média é: " + media + " Aprovado");
        }else if(media >= 5){
            System.out.println("A média é: " + media + " Recuperação");
        }else {
            System.out.println("A média é: " + media + " Reprovado");
        }
        
        scanner.close();
    }
}
