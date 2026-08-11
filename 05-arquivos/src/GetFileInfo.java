import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File f = new File("teste.txt");
        if (f.exists()) {
            System.out.println("Nome do arquivo: " + f.getName());
            System.out.println("Caminho do arquivo: " + f.getAbsolutePath());
            System.out.println("Tem permissão de editar: " + f.canWrite());
            System.out.println("Tem premissão para ler: " + f.canRead());
            System.out.println("Tamanho do arquivo em bytes " + f.length());
        } else {
            System.out.println("O arquivo não existe.");
        }
    }
}
