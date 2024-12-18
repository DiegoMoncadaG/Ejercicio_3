package Ejercicio_21;

import java.util.Scanner;

public class main_LadoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer lado del triangulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo lado del triangulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer lado del triangulo: ");
        double lado3 = scanner.nextDouble();

        LadoTriangulo triangulo = new LadoTriangulo(lado1, lado2, lado3);

        if (triangulo.esTrianguloValido()) {
            double perimetro = triangulo.calcularPerimetro();
            double semiPerimetro = triangulo.calcularSemiperimetro();
            double area = triangulo.calcularArea();

            System.out.println("\nInformacion del Triangulo:");
            System.out.println("Perimetro: " + String.format("%.2f", perimetro));
            System.out.println("Semiperimetro: " + String.format("%.2f", semiPerimetro));
            System.out.println("Area: " + String.format("%.2f", area));
        } else {
            System.out.println("Los valores ingresados no corresponden a un triangulo.");
        }
    }
}
