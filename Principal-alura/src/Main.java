import javax.swing.*;
import java.io.File;

public class Main extends Produto {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome= "Banana";
        produto.analisar(produto.nome);


    }
}
