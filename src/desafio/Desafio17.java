package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public List<Integer> numerosPrimos() {
        return numeros.stream()
                .filter(Desafio17::isPrimo)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(new Desafio17().numerosPrimos());
    }
}
