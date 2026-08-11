import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter(("teste.txt"));
            myWriter.write("Meu nome é Yasmin, bem vindo ao arquivo Teste!!");
            myWriter.close();
            System.out.println("O arquivo foi gravado!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}
