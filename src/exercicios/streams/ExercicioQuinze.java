package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;

public class ExercicioQuinze {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 15, 16, 7, 10, 8, 9, 11, 21, -2);

        // Desafio 15 - Verifique se a lista contém pelo menos um número negativo:

        // Retorna True or False para se há numeros negativos na lista
        boolean temNegativos = numeros.stream()
                .anyMatch(numero -> numero < 0);

        System.out.println("Tem negativos: " + temNegativos);

        // Imprime os números negativos
//        System.out.println(
//                numeros.stream()
//                        .filter(n -> n < 0)
//                        .collect(Collectors.toList())
//        );
    }
}
