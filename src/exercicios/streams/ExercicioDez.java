package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioDez {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 15, 8, 9, 10, 11, 11);

        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:

//        numeros.stream()
//                .filter(n -> n % 3 == 0)
//                .filter(num -> num % 5 == 0)
//                .toList();
//
        System.out.println(numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .collect(Collectors.toList()) // Ou forma resumida -> .toList
        );
    }
}
