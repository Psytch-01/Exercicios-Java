package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioTreze {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 15, 16, 7, 10, 8, 9, 11, 21);

        // Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        // Utilize a Stream API para filtrar os números que estão dentro de um
        // intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

        System.out.println(
                numeros.stream()
                        .filter(n -> n >=5 && n <=10)
                        .sorted()
                        .collect(Collectors.toList())
        );
    }
}
