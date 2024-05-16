package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {

    private List<Integer> numeros = Arrays.asList(-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> verificarNumerosPositivos() {

        return numeros.stream()
                .filter(numero -> numero > 0)
                .toList();

    }

    public static void main(String[] args) {
        Desafio3 desafio = new Desafio3();
        desafio.verificarNumerosPositivos().forEach(System.out::println);
    }
}
