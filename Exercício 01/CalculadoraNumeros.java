import java.util.Scanner;

public class CalculadoraNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int quantidadeNumeros = 0;
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite vários números inteiros. Digite -1 para encerrar:");

        while (true) {
            numero = scanner.nextInt();

            if (numero == -1) {
                break; // Encerra o loop quando -1 é digitado
            }

            quantidadeNumeros++;
            soma += numero;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        if (quantidadeNumeros > 0) {
            double media = (double) soma / quantidadeNumeros;

            System.out.println("Quantidade de números digitados: " + quantidadeNumeros);
            System.out.println("Maior número digitado: " + maior);
            System.out.println("Menor número digitado: " + menor);
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        scanner.close();
    }
}
