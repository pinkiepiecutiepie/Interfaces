package ec.edu.puce.interfaces;

public class Main {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAncho(5);
        rectangulo.setAlto(11);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(35);
        triangulo.setAltura(70);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        Circulo circulo = new Circulo();
        circulo.setRadio(18);
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}