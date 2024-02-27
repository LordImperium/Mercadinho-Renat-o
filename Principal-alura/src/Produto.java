import javax.swing.*;

public class Produto {

    String nome;
    int valor;
    int quantidade;
    int validade;

    void analisar(String nome){
        JOptionPane.showMessageDialog(null, this.nome);
    }
}
