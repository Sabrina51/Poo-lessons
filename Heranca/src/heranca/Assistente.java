package heranca;

//import java.text.DecimalFormat;

public class Assistente extends Aluno {

    private Integer faltas;

    public Assistente(Integer faltas, String nome, String rg, String ra) {
        super(nome, rg, ra);
        this.faltas = faltas;
    }

    public Integer getFaltas() {
        return faltas;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    public Double calculoFrequencia() {
        return 100 - (faltas * 100.0 / 80);
    }

//    public void dadosAlunoAssistente() {
//        System.out.println(
//            "----- Aluno Assistente -----" + "\n"
//            + "Nome do aluno(a): " + getNome() + "\n"
//            + "RA: " + getRa() + "\n"
//            + "RG: " + getRg() + "\n"
//            + "Quantidade de faltas: " + new DecimalFormat("").format(faltas) + "\n"
//            + "Porcentagem de frequência: " + calculoFrequencia() + "%" + "\n"
//        );
//    }
    @Override
    public void print() {
        System.out.println("----- Aluno Assistente ----- \n");
        super.print();
        System.out.println(
//          "Quantidade de faltas: " + new DecimalFormat("").format(faltas) + "\n" +
            "Quantidade de faltas: " + faltas + "\n" +
            "Porcentagem de frequência: " + calculoFrequencia() + "%" + "\n"
        );
    }
}
