package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    public List<Integer> intervalo(){
        return numeros.stream()
                .filter(numero -> numero >= 5 && numero <= 10)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(new Desafio13().intervalo());
    }
}
