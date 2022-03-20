package heranca;

import java.text.DecimalFormat;

public class Assistente extends Aluno{
    private Double faltas;

    public Assistente(Double faltas, String nome, String rg, String ra) {
        super(nome, rg, ra);
        this.faltas = faltas;
    }

    public Double getFaltas() {
        return faltas;
    }

    public void setFaltas(Double faltas) {
        this.faltas = faltas;
    }
    
    public Double calculoFrequencia() {
        return 100 - (faltas * 100 / 80);
        
    }
    
    public void dadosAlunoAssistente() {
        System.out.println(
            "----- Aluno Assistente -----" + "\n" +
            "Nome do aluno: " + getNome() + "\n" +
            "RA: " + getRa() + "\n" + 
            "RG: " + getRg() + "\n" +
            "Quantidade de faltas: " + new DecimalFormat("").format(faltas) + "\n" +
            "Porcentagem de frequência: " + calculoFrequencia() + "%" + "\n"
        );
    }
}