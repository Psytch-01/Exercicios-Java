package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;

public class ExercicioDois {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 2 - Imprima a soma dos números pares da lista:

        int somaDosPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .reduce(0, Integer::sum); // Usando lambda sem Method Reference reduce(0, (a, b) -> a + b)

        System.out.println("A soma dos números pares da lista resulta em: " + somaDosPares);

        /* Para imprimir, também poderiamos usar System.out.println direto
         * ao inves de salvar em uma variável como feito acima
         *
         * System.out.println(
         * numeros.stream()
         *    .filter(num -> num % 2 ==0)
         *    .reduce(0, Integer::sum)
         * );
         */
    }
}
