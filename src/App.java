import java.io.File;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("======================================");
    //Nesse programa ali eu pesso para o usuario digitar um caminho de uma pasta
    System.out.println("Digite um caminho de pasta: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);
    //Eu fiz questao de colocar o nome da vareavel de path para indicar que uma vareavel do tipo File
    //Ela pode ser tanto caminho de um arquivo quanto um caminho de uma pasta! entao eu to colocando path para infatizar isso

    //So essa chamada abaixo vai criar para mim em vector de files contendo cada um dos caminhos das pastinhas
    File[] folders = path.listFiles(File::isDirectory);
    // Aki eu vou pegar todas as pastas que estao a partir desse caminho e gerar uma listagem das pastas
    System.out.println("FOLDERS: ");
    for (File folder : folders) {
      System.out.println(folder);
    }
    System.out.println("======================================");
    //Aki agora eu vou fazer a mesma coisa so que agora eu vou querer a listinha de arquivos so os arquivos e nao as pastas
    File[] files = path.listFiles(File::isFile);
    System.out.println("FILES: ");
    for (File file : files) {
      System.out.println(file);
    }
    //O ultimo texte vai ser criar uma sub pasta a partir da pasta digitada na vareavel strPath
    System.out.println("======================================");
    boolean success = new File(strPath + "\\NovaMente1").mkdir();
    System.out.println("Diretorio Criado Com Sucesso: " + success);

    System.out.println("======================================");

    sc.close();
  }
}
