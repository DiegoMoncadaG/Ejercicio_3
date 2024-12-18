package Ejercicio_21;

public class LadoTriangulo {
    private double lado1, lado2, lado3;

    public LadoTriangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularSemiperimetro() {
        return calcularPerimetro() / 2;
    }

    public double calcularArea() {
        double semiPerimetro = calcularSemiperimetro();
        return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
    }

    public boolean esTrianguloValido() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}
