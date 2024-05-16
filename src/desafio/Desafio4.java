package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio4 {

    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> removerNumerosImpares(){
        return numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();
    }

    public static void main(String[] args) {
        Desafio4 desafio = new Desafio4();
        System.out.println(desafio.removerNumerosImpares());
    }
}
