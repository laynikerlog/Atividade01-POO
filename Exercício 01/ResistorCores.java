import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ResistorCores {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as cores do resistor, separadas por espaço:");
        String input = scanner.nextLine();

        String[] colors = input.toLowerCase().split(" ");

        if (colors.length >= 2) {
            int resistorValores = CodigoResistor(colors[0], colors[1]);
            System.out.println("O valor do resistor é: " + resistorValores);
        } else {
            System.out.println("Por favor, digite pelo menos duas cores separadas por espaço.");
        }
    }

    public static int CodigoResistor(String color1, String color2) {
        Map<String, Integer> ValorCor = ValorCoresMap();

        if (ValorCor.containsKey(color1) && ValorCor.containsKey(color2)) {
            int result = ValorCor.get(color1) * 10 + ValorCor.get(color2);
            return result;
        } else {
            System.out.println("Cores não reconhecidas. Certifique-se de digitar cores válidas.");
            return -1; // Valor de retorno indicando cores não reconhecidas
        }
    }

    private static Map<String, Integer> ValorCoresMap() {
        Map<String, Integer> ValorCor = new HashMap<>();
        ValorCor.put("preto", 0);
        ValorCor.put("marrom", 1);
        ValorCor.put("vermelho", 2);
        ValorCor.put("laranja", 3);
        ValorCor.put("amarelo", 4);
        ValorCor.put("verde", 5);
        ValorCor.put("azul", 6);
        ValorCor.put("violeta", 7);
        ValorCor.put("cinza", 8);
        ValorCor.put("branco", 9);
        return ValorCor;
    }
}
