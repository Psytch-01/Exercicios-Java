package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;

public class ExercicioDoze {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 15, 8, 9, 10, 5, 4, 3, 11);

        // Desafio 12 - Encontre o produto de todos os números da lista:

        // A inicialização do reduce com 1, mantem a multiplicação neutra. Se usar 0, o reduce retornará um Optional
        System.out.println(
                numeros.stream()
                .reduce(1, (n1, n2) -> n1 * n2)
        );
    }
}
