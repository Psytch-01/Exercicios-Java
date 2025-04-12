package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ExercicioCinco {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 5 - Calcule a média dos números maiores que 5

        OptionalDouble mediaDosNumerosAcimaDeCinco = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue) //(n -> n.intValue())
                .average();

        if (mediaDosNumerosAcimaDeCinco.isPresent()) {
            System.out.println("A média dos números acima de 5 da lista é: " + mediaDosNumerosAcimaDeCinco.getAsDouble());
        } else {
            System.out.println("Não há média para retornar");
        }
    }
}
