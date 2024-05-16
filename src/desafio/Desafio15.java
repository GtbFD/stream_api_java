package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {

    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -19);

    public List<Integer> numerosNegativos(){
        return numeros.stream()
                .filter( numero -> numero < 0)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(new Desafio15().numerosNegativos());
    }
}
