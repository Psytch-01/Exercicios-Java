package src.exercicios.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioDezoito {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(2, 3, 4, 5, 15, 16, 7, 10, 8, 9, 11, 21);

        // Desafio 18 - Verifique se todos os números da lista são iguais

        boolean todosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.getFirst()));

        System.out.println("Todos os números são iguais? " + todosIguais);
    }
}
