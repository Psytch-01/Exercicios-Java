package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;

public class ExercicioUm {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 1 - Mostre a lista na ordem numérica:
        // Uso do sorted() para organizar a lista
        // Uso do forEach() para imprimir os números

        numeros.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));

    }
}
