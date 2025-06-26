// soma de dois números

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int soma;

        System.out.println("digite o primeiro número:");
        num1 = scanner.nextInt();

        System.out.println("digite o primeiro segundo número:");
        num2 = scanner.nextInt();

        soma = num1 + num2;

        System.out.printf("O resultado da soma entre %d e %d = %d", num1, num2, soma);


    }
}
