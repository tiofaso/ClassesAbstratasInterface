package exercicio02RetanguloCirculoQuadrado;

public class Retangulo extends Forma {

    @Override
    public void calcularArea() {
        this.area = this.base * this.altura;
        System.out.println("A área do retângulo é: " + this.area);
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.altura + this.altura + this.base + this.base;
        System.out.println("O perímetro do retângulo é: " + this.perimetro);
    }
}
