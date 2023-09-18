package Gianfranco_Rafael_Franchini.calculadoraconsole;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String texto = ("Qual operação deseja realizar? \n [1] Soma \n [2] Subtração \n [3] Multiplicação \n [4] Divisão \n [5] Sair");
            System.out.println(texto);
            int escolha = input.nextInt();

            System.out.println("Insira o primeiro número:");
            Double val1 = input.nextDouble();

            System.out.println("Insira o Segundo número:");
            Double val2 = input.nextDouble();

            System.out.println(escolha);

            switch (escolha) {
                case 1:
                    System.out.println(val1 + val2);
                    break;
                case 2:
                    System.out.println(val1 - val2);
                    break;
                case 3:
                    System.out.println(val1 * val2);
                    break;
                case 4:
                    if (val2 == 0d) {
                        throw new RuntimeException("Valor inserido não é valido");
                    } else {
                        System.out.println(val1 / val2);
                    }
                break;

                case 5:
                System.out.println("Você saiu do programa");
                break;

                default:
                System.out.println("Insira uma opção válida");
                    break;
            }
        }
        

    }
    
}