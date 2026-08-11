import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws Exception {
        try {
            File fileObj = new File("teste.txt");
            if (fileObj.createNewFile()) {
                System.out.println("Arquivo criado " + fileObj.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}



