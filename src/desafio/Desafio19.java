package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    private List<Integer> numeros = Arrays.asList(3, 5, 10, 15, 20, 25);

    public Integer somaDosNumerosDivisiveis(){
        return numeros.stream()
                .filter(numero -> numero % 3 == 0 && numero % 5 == 0)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(new Desafio19().somaDosNumerosDivisiveis());
    }
}
