package src.exercicios.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 15, 16, 7, 10, 8, 9, 11, 21);

        // Desafio 14 - Encontre o maior número primo da lista
        // O Optional<Integer> é usado nesse exercicio para representar um valor que pode estar presente ou não.
        // A função max() retorna um valor opcional porque pode não haver um "máximo" em um fluxo vazio.

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(numero -> ehPrimo(numero)) // <- lambda
              //.filter(ExercicioQuatorze::ehPrimo) <- Method Reference
                .max(Comparator.naturalOrder());

        maiorPrimo.ifPresent(primo -> System.out.println("Maior número primo da lista: " + primo));
    }

    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) { // Verifica até a raiz quadrada de n
            if (n % i == 0) return false; // Se for divisivel por qualquer numero não é primo
        }
        return true;
    }
}
