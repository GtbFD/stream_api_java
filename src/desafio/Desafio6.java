package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {

    private List<Integer> numeros
            = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> verificaNumeroMaiorQueDez(){
        return numeros.stream()
                .filter(numero -> numero > 10)
                .toList();
    }

    public static void main(String[] args) {
        Desafio6 desafio = new Desafio6();
        System.out.println(desafio.verificaNumeroMaiorQueDez());
    }
}
