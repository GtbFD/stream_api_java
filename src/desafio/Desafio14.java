package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {

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

    public Integer maiorPrimo() {
        return numeros.stream()
                .filter(Desafio14::isPrimo)
                .max(Integer::compareTo).get();
    }

    public static void main(String[] args) {
        System.out.println(new Desafio14().maiorPrimo());
    }

}
