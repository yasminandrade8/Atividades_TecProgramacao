public class Main {
    public static void main(String[] args) throws Exception {
        Calculadora c = new Calculadora();

        System.out.println("Soma");
        System.out.println(c.somar(34, 12));
        System.out.println("=".repeat(30));

        System.out.println("Subtração");
        System.out.println(c.sub(67, 15));
        System.out.println("=".repeat(30));

        System.out.println("Multiplicação");
        System.out.println(c.mult(5, 8));
        System.out.println("=".repeat(30));

        System.out.println("Divisão");
        System.out.println(c.div(87, 111));
    }
}
