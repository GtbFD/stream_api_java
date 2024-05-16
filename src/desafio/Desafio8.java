package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {

    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public Integer somarDigitos() {
        return numeros.stream()
                .map((numero) -> String.valueOf(numero))
                .flatMapToInt((string) -> string.chars())
                .map((caractere) -> Character.getNumericValue(caractere))
                .sum();
    }

    private static int[] digitos(int numero) {
        return Integer.toString(numero)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(new Desafio8().somarDigitos());
    }
}
