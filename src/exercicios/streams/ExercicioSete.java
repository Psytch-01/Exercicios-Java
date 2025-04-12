package src.exercicios.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExercicioSete {
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 15, 16, 7, 10, 8, 9, 11, 21);

        // Desafio 7 - Encontrar o segundo número maior da lista

        // .ifPresent retorna um opcional que ja trata se há ou não o número solicitado
        // Se não houver, não acontecerá nada sem um else

        numeros.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .ifPresent(segundoMarior -> System.out.println("O segundo maior número é: " + segundoMarior));
    }
}