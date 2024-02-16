public class DistanciaHamming {

    public static void main(String[] args) {
        String cadeia1 = "GAGCCTACTAACGCGAT";
        String cadeia2 = "AATCGTAATGACGGCCT";

        int distanciaHamming = calcularDistanciaHamming(cadeia1, cadeia2);

        System.out.println("Distância de Hamming: " + distanciaHamming);
    }

    public static int calcularDistanciaHamming(String cadeia1, String cadeia2) {
        int distancia = 0;

        // Verifica se as duas cadeias têm o mesmo comprimento
        if (cadeia1.length() != cadeia2.length()) {
            throw new IllegalArgumentException("As cadeias devem ter o mesmo comprimento.");
        }

        // Itera sobre as cadeias e conta as diferenças
        for (int i = 0; i < cadeia1.length(); i++) {
            if (cadeia1.charAt(i) != cadeia2.charAt(i)) {
                distancia++;
            }
        }

        return distancia;
    }
}
