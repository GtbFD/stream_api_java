package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {

    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -19);

    public boolean numerosIguais(){
        return numeros.stream()
                .distinct()
                .count() == 1;
    }

    public static void main(String[] args) {
        System.out.println(new Desafio18().numerosIguais());
    }
}
