package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {

    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public Integer calcularMediaMaiorQueCinco(){
        return numeros.stream()
                .filter(numero -> numero > 5)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        Desafio5 desafio = new Desafio5();
        System.out.println(desafio.calcularMediaMaiorQueCinco());
    }
}
