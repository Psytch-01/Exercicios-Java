package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioOnze {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 15, 8, 9, 10, 5, 4, 3, 11);

        // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista

        System.out.println("A soma dos quadrados dos números da lista é: " +
                numeros.stream()
                        .mapToInt(n -> n * n)
                        .reduce(0, Integer::sum)
        );
    }
}
