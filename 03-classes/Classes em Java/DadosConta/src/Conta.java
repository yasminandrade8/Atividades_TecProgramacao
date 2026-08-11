public class Conta {
    public int num;
    public String nome;
    public String cpf;
    public double saldo;
    
    public double dpositar(double vlr) {
        saldo += vlr;
        return saldo;
    }
    public void exibirDados() {
        System.out.println("Conta: " + num);
        System.out.println("Titular: " + nome);
        System.out.println("CPF do Titular: " + cpf);
        System.out.println("Saldo da conta: " + saldo);
    }
}
