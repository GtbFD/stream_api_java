package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> pares(){
        return numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();
    }

    public List<Integer> impares(){
        return numeros.stream()
                .filter(numero -> numero % 2 == 1)
                .toList();
    }

    public static void main(String[] args) {
        Desafio16 desafio = new Desafio16();
        System.out.println("Números pares = " + desafio.pares());
        System.out.println("Números ímpares = " + desafio.impares());
    }
}
