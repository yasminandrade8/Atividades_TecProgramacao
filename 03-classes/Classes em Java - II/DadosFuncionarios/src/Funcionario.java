public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double desconto;

    public double salarioLiquido() {
        return salarioBruto - desconto;
    }
    public void aumentarSalario(double vlr) {
        this.salarioBruto += this.salarioBruto * (vlr / 100);
    }
    public void exibir() {
        System.out.println("Dados do funcionario: ");
        System.out.println("Nome: " + nome + ", Salário: " + salarioBruto);
    }
    public void exibirDados(){
        System.out.println("Dados do funcionário + aumento:" );
        System.out.println("Nome: " + nome + ", Salário: " + salarioLiquido());
    }
}
