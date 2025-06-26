//Conversão de Temperatura

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double C;
        double F;

        System.out.println("digite a temperatura em celsius:");
        C = scanner.nextDouble();

        F = (C * 9/5) + 32;

        System.out.printf("A temperatura em Fahrenheit é: %.2f", F);




    }

}
