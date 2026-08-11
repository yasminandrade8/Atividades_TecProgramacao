public class Aluno {
    public String RA;
    public String nome;
    public String endereco;
    public String curso;

    public void exibirDiciplinas() {
        if (this.curso.equalsIgnoreCase("Cosmeticos")) {
            String [] c = {"Matérias-primas e Ativos da Indústria Cosmética", "Assuntos Regulatóriose Legislação Cosmitica", "Fisico-Quimica", "Anatomia e Fisiologia Cutanea", "Estatística", "Quimica Inorgânica", "Quimica Orgânica II", "Quimica Experimental"};
            System.out.println("DISCIPLINAS:");
            for (String materia : c) {
                System.out.println(materia);
            }
            
        } else if (this.curso.equalsIgnoreCase("DSM")) {
            String [] d = {"Banco de Dados - Relacional", "Engenharia de Software II", "Estrutura de Dados", "Desenvovimento web", "Matemática para Computação", "Técnicas de Programação I"};
            System.out.println("DISCIPLINAS:");
            for (String materia : d) {
                System.out.println(materia);
            }
        
        } else if (this.curso.equalsIgnoreCase("GPI")) {
            String [] g = {"Ergonomia", "Materiais e Tratamentos I", "Estatística", "Gestão da Produção Aplicada a Operações e Serviços", "Liderança e Gestão de Pessoas", "Lingua IngleSa II", "Projeto Integrador"};
            System.out.println("DISCIPLINAS:");
            for (String materia : g) {
                System.out.println(materia);
            }
        }
    }

    public void exibirDados() {
        System.out.println("RA: " + RA);
        System.out.println("Aluno: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Curso: " + curso);
    }
}
