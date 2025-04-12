package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioSeis {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 15, 8, 9, 10, 5, 4, 3, 11);

        // Desafio 6 - Verificar se a lista contém algum número maior que 10:

        // Retorna true or false para verificar a existencia de números acima de 10, no caso True.
        boolean numerosAcimadeDez = numeros.stream()
                    .anyMatch(n -> n > 10);

        System.out.println(numerosAcimadeDez);


//        Retorna os números asima de 10 dentro da List.

//        System.out.println(
//                numeros.stream()
//                        .filter(n -> n > 10)
//                        .sorted()
//                        .collect(Collectors.toList())
//        );
    }
}
