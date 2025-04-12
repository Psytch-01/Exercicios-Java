package src.exercicios.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioDezesseis {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 15, 16, 7, 10, 8, 9, 11, 21);

        // Desafio 16 - Agrupe os números em pares e ímpares:

        List<Integer> numerosPares = new ArrayList<>();
        numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(numerosPares::add); // .forEach(numero -> numerosPares.add(numero)); -- Versão lambda

        List<Integer> numerosImpares = new ArrayList<>();
        numeros.stream()
                .filter(numero -> numero % 2 == 1)
                .forEach(numerosImpares::add); // .forEach(numero -> numerosImpares.add(numero)); -- Versão lambda

        System.out.println("Essa lista imprime a lista de números pares: " + numerosPares);
        System.out.println("Essa lista imprime a lista de números ímpares: " + numerosImpares);
    }
}
