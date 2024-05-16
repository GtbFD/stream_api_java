package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {

    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public Integer somaDosNumeros(){
        return numeros.stream()
                .filter((numero) -> numero % 2 == 0)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        Desafio2 desafio = new Desafio2();

        System.out.println(desafio.somaDosNumeros());
    }
}
