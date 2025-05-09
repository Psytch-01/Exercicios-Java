package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioQuatro {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 4 - Remova todos os valores ímpares:

        numeros.stream()
                .filter ( n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }
}
