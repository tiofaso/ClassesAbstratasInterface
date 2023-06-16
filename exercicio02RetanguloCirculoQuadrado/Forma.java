package exercicio02RetanguloCirculoQuadrado;

abstract class Forma {
    double base;
    double altura;
    double area;
    double perimetro;
    double lado;
    double comprimento;
    double raio;

    public abstract void calcularArea();
    public abstract void calcularPerimetro();
}
