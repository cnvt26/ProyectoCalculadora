package ProyectoCalculadora;

public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(int num1, int num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public int suma() {
        return this.numero1 + this.numero2;
    }

    public int resta() {
        return this.numero1 - this.numero2;
    }

    public int multiplicar() {
        return this.numero1 * this.numero2;
    }
}