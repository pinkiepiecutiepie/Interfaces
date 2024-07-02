package ec.edu.puce.interfaces;

public class Rectangulo implements FiguraGeometrica {

    private double ancho;
    private double alto;

    @Override
    public double calcularArea() {
        return this.ancho * this.alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}