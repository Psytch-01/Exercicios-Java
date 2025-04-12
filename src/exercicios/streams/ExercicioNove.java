package src.exercicios.streams;

import java.util.Arrays;
import java.util.List;

public class ExercicioNove {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 15, 8, 9, 10, 11, 11);

        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):

        // A lógica desse exercicio foi criar uma variavel "verificacaoDistintos" que compare
        // o tamanho da lista original com o tamanho da lista com todos os números distintos
        // e retornar um boolean com true or false

        boolean verificacaoDistintos = numeros.size() == numeros.stream()
                .distinct()
                .count();

        System.out.println("Todos os números são distintos? " + verificacaoDistintos);

    }
}
