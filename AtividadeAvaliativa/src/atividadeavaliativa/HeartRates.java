package atividadeavaliativa;
import java.util.Calendar;

public class HeartRates{
    private String nome;
    private String snome;
    private Integer dataNasc;
    
    public HeartRates(String nome, String snome, Integer dataNasc){
        this.nome = nome;
        this.snome = snome;
        this.dataNasc = dataNasc;
    }
    
    public double CalcFreqMax(){
        double FreqMax = 220 - CalcIdade(dataNasc);
        return FreqMax;
    }
    
    public double CalcFreqAlvoMax(){
        double FreqAlvoMax = (220 - this.CalcIdade(dataNasc)) * 0.85;
        return FreqAlvoMax;
    }
    
    public double CalcFreqAlvoMin(){
        double FreqAlvoMin = (220 - this.CalcIdade(dataNasc))* 0.50;
        return FreqAlvoMin;
    }
    
    public void PrintarFuncao(String nome, String snome, Integer dataNasc){
        System.out.println("Nome: "+nome+"\nSobrenome: "+snome);
        System.out.println("Idade: "+CalcIdade(dataNasc));
        System.out.println("Frequência cardíaca máxima: "+CalcFreqMax());
        System.out.println("Frequência cardíaca alvo máxima: "+CalcFreqAlvoMax());
        System.out.println("Frequência cardíaca alvo mínima: "+CalcFreqAlvoMin()); 
    }
    
    public int CalcIdade(Integer dataNasc){
        Calendar hoje = Calendar.getInstance();
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        int mesAtual = hoje.get(Calendar.MONTH);
        int anoAtual = hoje.get(Calendar.YEAR);
        
        int diaNasc = dataNasc / 1000000;
        int mesNasc = (dataNasc%1000000) / 10000;
        int anoNasc = dataNasc%10000;
        int idade; //int idade = anoAtual - anoNasc;
        
        if(mesAtual >= mesNasc){
            idade = anoAtual - anoNasc;
        }else{
            idade = anoAtual - anoNasc - 1;
        }
        /*
        if(mesAtual >= mesNasc){
            idade = anoAtual - anoNasc;
        }else if((mesAtual == mesNasc) && diaAtual < diaNasc){
            idade -= 1;
        }
        */
        return idade;   
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }

    public Integer getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Integer dataNasc) {
        this.dataNasc = dataNasc;
    }
}