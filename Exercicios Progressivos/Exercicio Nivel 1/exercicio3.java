// Cálculo da Área do Círculo

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        double raio;
        double area;

        System.out.println("Digite o raio do círculo:");
        raio = scanner.nextDouble();

        area = pi * raio * raio;

        System.out.printf("A área do círculo é: %f", area);

    }

}
