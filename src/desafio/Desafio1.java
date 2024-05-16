package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio1 {

    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> mostrarEmOrdemNumerica(){
        return numeros.stream().sorted().toList();
    }

    public static void main(String[] args) {

        Desafio1 desafio1OrdemNumerica = new Desafio1();
        desafio1OrdemNumerica.mostrarEmOrdemNumerica().forEach(System.out::println);
    }
}
