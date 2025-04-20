# Exercicios-Java

Repositório de exercícios realizados em estudo

---

## Enunciados

### Execícios Fundamentos Java

- 1 - Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

- 2 - Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
  - fórmula: área=lado X lado

- 3 - Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
  - fórmula: área=base X altura

- 4 -Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

[Link para as resolução dos exercícios](https://github.com/Psytch-01/Exercicios-Java/tree/main/src/exercicios/fundamentos)

---

### Exercícios Estruturas de Controle

1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
- Se for menor ou igual a 18,5 "Abaixo do peso";
- se for entre 18,6 e 24,9 "Peso ideal";
- Se for entre 25,0 e 29,9 "Levemente acima do peso";
- Se for entre 30,0 e 34,9 "Obesidade Grau I";
- Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
- Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;

4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados.

[Link para as resolução dos exercícios](https://github.com/Psytch-01/Exercicios-Java/tree/main/src/exercicios/controle)

---

### Exercícios de Abstração

1. Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
- Consultar saldo
- consultar cheque especial
- Depositar dinheiro;
- Sacar dinheiro;
- Pagar um boleto.
- Verificar se a conta está usando cheque especial.

#### Siga as seguintes regras para implementar

- A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
- O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
- Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
- Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
- Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

[Link para as resolução dos exercícios](https://github.com/Psytch-01/Exercicios-Java/tree/main/src/exercicios/abstracao)

---

### Stream API Java - Principais Métodos

Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!

Para todos os desafios, utilizem a lista de números inteiros fornecida:

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
```
A Lista foi modificada em alguns exercicios, mas apenas adições sutís para 
o exercicio.


**Desafios:**

1. Mostre a lista na ordem numérica.
2. Imprima a soma dos números pares da lista.
3. Verifique se todos os números da lista são positivos.
4. Remova todos os valores ímpares.
5. Calcule a média dos números maiores que 5.
6. Verificar se a lista contém algum número maior que 10.
7. Encontrar o segundo número maior da lista.
8. Somar os dígitos de todos os números da lista.
9. Verificar se todos os números da lista são distintos (não se repetem).
10. Agrupe os valores ímpares múltiplos de 3 ou de 5.
11. Encontre a soma dos quadrados de todos os números da lista.
12. Encontre o produto de todos os números da lista.
13. Filtrar os números que estão dentro de um intervalo.
14. Encontre o maior número primo da lista.
15. Verifique se a lista contém pelo menos um número negativo.
16. Agrupe os números em pares e ímpares.
17. Filtrar os números primos da lista.
18. Verifique se todos os números da lista são iguais.
19. Encontre a soma dos números divisíveis por 3 e 5.

**Instruções:**

- Cada desafio deverá ser implementado em classes separadas neste mesmo pacote.
- Os desafios podem ser executados individualmente a partir dos métodos main de cada classe.
- Utilize a Stream API para implementar as operações solicitadas em cada desafio.

[Link para as resolução dos exercícios](https://github.com/Psytch-01/Exercicios-Java/tree/main/src/exercicios/streams)

