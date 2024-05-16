package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {

    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    public Integer multiplos(){
        return numeros.stream()
                .map(numero -> numero * numero)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(new Desafio11().multiplos());
    }
}
