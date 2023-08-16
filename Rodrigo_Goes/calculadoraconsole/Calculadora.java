import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws Exception {

        Scanner inputEscolha = new Scanner(System.in);

        String texto = "Qual operação deseja realizar?:\n[1]Soma\n[2]Subtação\n[3]Multiplicação \n[4]Divisão\n[5]Sair";
        System.out.println(texto);
        int escolha = inputEscolha.nextInt();

        if (escolha == 5) {
            inputEscolha.close();
            return;
        }

        calcular(escolha);
        inputEscolha.close();
    }

    static void calcular(int escolha) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        Double val1 = input.nextDouble();

        System.out.println("Insira o segundo número:");
        Double val2 = input.nextDouble();

        if (val2 == 0.0) {
            input.close();
            throw new RuntimeException("Valor inserido inválido");
        }

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
                System.out.println(val1 / val2);
                break;
            default:
                break;
        }

        input.close();
    }
}
