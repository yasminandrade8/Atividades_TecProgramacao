public class FuncionarioPj extends Funcionario {
    private double salarioPj;
    private int horasTrabalhadas;

    public FuncionarioPj(String nome, String matricula, double salarioPj, int horasTrabalhadas) {
        super(nome, matricula);
        this.salarioPj = salarioPj;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    @Override
    public double calcularSalario() {
        return salarioPj / horasTrabalhadas;
    }
    public void exibir() {
        System.out.println("** Funcionário PJ **");
        System.out.println("Nome: %s \nMatricula: %s \nSalário Mensal: %.2f \nHoras Trabalhadas: %d \nSalario Fixo(por hora): %.2f"
            .formatted(getNome(), getMatricula(), getSalarioPj(), getHorasTrabalhados(), calcularSalario())
        );
    }

    public void setSalarioMen(double salarioPj) {
        this.salarioPj = salarioPj;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioPj() {
        return salarioPj;
    }
    public int getHorasTrabalhados() {
        return horasTrabalhadas;
    }
}
