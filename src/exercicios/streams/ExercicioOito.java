package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;

public class ExercicioOito {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 15, 8, 9, 10, 5, 4, 3, 11);

        // Desafio 8 - Somar os dígitos de todos os números da lista:

        // Usando .reduce(0, Integer::Sum); o qual a versão completa lambda é: .reduce(0, (a, b) -> a + b)
        // 0 é o valor inicial da soma

       int somaDosElementos = numeros.stream()
               .reduce(0, Integer::sum);

       System.out.println("A soma dos números é: " + somaDosElementos);

    }
}
