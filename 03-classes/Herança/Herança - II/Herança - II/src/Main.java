// Nome: Yasmin Rodrigues de Andrade
//Ra: 2171392521035
//Objetivo: Crie um sistema simples de gerenciamento de veículos que 
//          demonstre o uso de herança em Java

public class Main {
    public static void main(String[] args) throws Exception {
        Veiculo c = new Carro("Ford", "Fiesta", 2020, 4);
        c.exibir();
        c.acelerar();
        Veiculo m = new Moto("Honda", "CB 500", 2021, 500);
        m.exibir();
        m.acelerar();
    }   
}
