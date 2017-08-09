package atividadeavaliativa;

import java.text.ParseException;
import javax.swing.JOptionPane;

public class AtividadeAvaliativa {

    public static void main(String[] args) throws ParseException {
     
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String snome = JOptionPane.showInputDialog("Digite seu sobrenome: ");
        Integer nasc = Integer.parseInt( JOptionPane.showInputDialog("Digite sua data de nascimento: ") ) ;
       
        HeartRates hr = new HeartRates(nome, snome, nasc); 
        
        hr.PrintarFuncao(nome, snome, nasc);
    } 
}