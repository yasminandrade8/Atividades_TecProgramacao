package Herança_01;
public class Gerente extends Herança_01 {
    private int senha;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int r) {
        if (this.senha == r) {
            System.out.println("Acesso permitido");
            return true;
        }else {
            System.out.println("Acesso negado");
            return false;
        }
    }

    @Override public void exibir() {
        super.exibir();
        System.out.println("Senha: " + getSenha());
    }
}
