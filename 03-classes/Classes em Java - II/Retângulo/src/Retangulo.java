public class Retangulo {
    public double largura;
    public double altura;

    public double area() {        return largura * altura;
    }
    public double perimetro() {
        return 2 * (altura + largura);
       
    }
    public double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public void exibirDados() {
        System.out.println("AREA = " + area());
        System.out.println("PERIMETRO = " + perimetro());
        System.out.printf("DIAGONAL = %.2f%n", diagonal());
    }
}
