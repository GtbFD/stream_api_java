package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {

    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    public List<Integer> multiplos() {
        return numeros.stream()
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(new Desafio10().multiplos());
    }
}
