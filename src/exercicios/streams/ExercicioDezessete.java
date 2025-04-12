package src.exercicios.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ExercicioDezessete {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 15, 16, 7, 10, 8, 9, 11, 21);

        // Desafio 17 - Filtrar os números primos da lista:

        List<Integer> numerosPrimos = numeros.stream()
                .filter(ExercicioDezessete::ehPrimo)
                .toList();
//              .collect(Collectors.toList());

        System.out.println("Números primos: " + numerosPrimos);
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) return false; // 0 e 1 não são primos
        for (int i = 2; i <= Math.sqrt(n); i++) { // Verifica até a raiz quadrada de n
            if (n % i == 0) return false; // Se for divisivel por qualquer numero não é primo
        }
        return true;
    }
}
