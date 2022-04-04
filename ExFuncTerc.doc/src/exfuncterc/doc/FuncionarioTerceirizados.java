package exfuncterc.doc;

/**
 *
 * @author 0040482022028
 */
public class FuncionarioTerceirizados extends Funcionario {

    String empresaOrigem;
    Double horasMesTerceiros;

    public FuncionarioTerceirizados(String empresaOrigem, Double horasMesTerceiros, String nome, String rg) {
        super(nome, rg);
        this.empresaOrigem = empresaOrigem;
        this.horasMesTerceiros = horasMesTerceiros;
    }

    @Override
    public void relatorioMensal() {
        System.out.println("----- Funcionário Próprio Terceirizado -----");
        super.relatorioMensal();
        System.out.println("Nome da empresa: " + empresaOrigem + "\n" + 
                "Horas trabalhadas no mês: " + horasMesTerceiros + "\n");
    }
}
