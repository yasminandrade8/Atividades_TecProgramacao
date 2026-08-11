public class ContaCorrente {
    private String nome;
    private String sexo;
    private int idade;
    private int numConta;
    private String flag;
    private double saldo;

    public String getNome() {
        return nome;
    }
    public void setNome(String Nome) {
        nome = Nome;
    }
    
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String Sexo) {
        sexo = Sexo;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int Idade) {
        idade = Idade;
    }
    
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int NumConta) {
        numConta = NumConta;
    }

    public String getFlag() {
        return flag;
    }
    public void setFlag(String Flag) {
        flag = Flag;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double Saldo) {
        saldo = Saldo;
    }

    public void saque(double vlr, ContaCorrente [] contas) {
        if (vlr > 0 && vlr <= this.saldo) {
            this.saldo -= vlr;
            exibir(contas);
        }else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }
    public void deposito(double v, ContaCorrente [] contas) {
        if (v > 0) {
            this.saldo += v;
            exibir(contas);
        }
    }
    public void exibir(ContaCorrente[] contas) {
        System.out.printf("%-15s", "");
        for (int i = 0; i < contas.length; i++) {
            System.out.printf("%-15s", "CONTA " + (i + 1));
        }
        System.out.println("\n------------------------------------------------------------");

        System.out.printf("%-15s", "Nome:");
        for (ContaCorrente c : contas) {
            System.out.printf("%-15s", c.getNome());
        }
        System.out.println();

        System.out.printf("%-15s", "Nº da conta:");
        for (ContaCorrente c : contas) {
            System.out.printf("%-15s", c.getNumConta());
        }
        System.out.println();

        System.out.printf("%-15s", "Conjunta?");
        for (ContaCorrente c : contas) {
            System.out.printf("%-15s", c.getFlag());
        }
        System.out.println();

        System.out.printf("%-15s", "Saldo:");
        for (ContaCorrente c : contas) {
            System.out.printf("%-15.2f", c.getSaldo());
        }
        System.out.println();

        System.out.printf("%-15s", "Sexo:");
        for (ContaCorrente c : contas) {
            System.out.printf("%-15s", c.getSexo());
        }
        System.out.println();

        System.out.printf("%-15s", "Idade:");
        for (ContaCorrente c : contas) {
            System.out.printf("%-15s", c.getIdade());
        }
        System.out.println();
    }
}
