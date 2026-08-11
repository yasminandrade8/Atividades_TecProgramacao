public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    // Criamos um array para guardar 2 objetos do tipo ContaCorrente
    ContaCorrente[] contas = new ContaCorrente[2];

    for (int i = 0; i < contas.length; i++) {
        // IMPORTANTE: Criar uma nova instância em cada posição
        contas[i] = new ContaCorrente();

        System.out.println("--- Cadastro da Conta " + (i + 1) + " ---");

        System.out.print("Titular: ");
        contas[i].setNome(sc.nextLine());

        System.out.print("Nº da conta: ");
        contas[i].setNumConta(sc.nextInt());
        
        // Limpeza de buffer após ler número
        sc.nextLine(); 

        System.out.print("A conta é conjunta? (Sim/Não): ");
        contas[i].setFlag(sc.nextLine());

        System.out.print("Sexo: ");
        contas[i].setSexo(sc.nextLine());

        System.out.print("Idade: ");
        contas[i].setIdade(sc.nextInt());
        
        // Limpeza de buffer antes da próxima volta
        sc.nextLine(); 
        System.out.println();
    }

    // Exemplo de como exibir um dos nomes cadastrados
    System.out.println("O primeiro titular cadastrado foi: " + contas[0].getNome());
}