package exercicio02RetanguloCirculoQuadrado;

public class Quadrado extends Forma {
    @Override
    public void calcularArea() {
        this.area = this.lado * this.lado;
        System.out.println("A área do quadrado é: " + this.area);
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.lado + this.lado + this.lado + this.lado;
        System.out.println("O perímetro do quadrado é: " + this.perimetro);
    }
}
