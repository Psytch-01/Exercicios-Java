package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioDezenove {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 15, 16, 7, 10, 8, 9, 11, 21);

        // Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5

        List<Integer> somaDivisiveis = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .toList();

        System.out.println("A soma dos divisiveis por 3 e por 5 da Lista: " + somaDivisiveis + " resulta em: "
                + somaDivisiveis.stream().reduce(0, Integer::sum) // escrita em lambda .reduce(0, (n1, n2) -> n1 + n2)
        );
    }
}
