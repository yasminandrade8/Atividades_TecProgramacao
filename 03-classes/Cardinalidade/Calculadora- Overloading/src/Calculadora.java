public class  Calculadora {
    
    public int somar(int x, int y) {
        return x + y;
    }
    public int somar(int x, int z, int y) {
        return x + z + y;
    }
    public double sub(int x, int y) {
        return x - y;
    }
    public double sub(int x, int y, int z) {
        return z - (x - y);
    }
    public int mult(int z, int x) {
        return z * x;
    }
    public int mult(int x, int y, int z) {
        return x * (y * z);
    }
    public double div(int x, int y) {
        return x / y;
    }
    public double div(int x, int y, int z) {
        return z / (x / y);
    }
}
