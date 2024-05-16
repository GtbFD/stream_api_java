package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {

    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public Integer segundoMaiorNumero() {

        return numeros.stream()
                .sorted((numero1, numero2) -> numero2.compareTo(numero1))
                .skip(1)
                .findFirst().orElse(0);


    }

    public static void main(String[] args) {
        Desafio7 desafio = new Desafio7();
        System.out.println(desafio.segundoMaiorNumero());
    }
}
