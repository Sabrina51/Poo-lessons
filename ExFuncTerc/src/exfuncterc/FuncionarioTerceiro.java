package exfuncterc;

/**
 *
 * @author Sabrina Silva
 */
public class FuncionarioTerceiro extends Funcionario {

    private String nomeEmpresa;
    private Double salarioLiquidoTerceiro, salarioPorHoraTerceiro, horastrabalhadasMesTerceiro;

    public FuncionarioTerceiro(String nomeFuncionario, String rgFuncionario, Double salarioPorHoraTerceiro) {
        super(nomeFuncionario, rgFuncionario);
        this.salarioPorHoraTerceiro = salarioPorHoraTerceiro;
    }

    void calcularSalario(String empresa, Double horas) {
        this.nomeEmpresa = empresa;
        this.horastrabalhadasMesTerceiro = horas;
        this.salarioLiquidoTerceiro = salarioPorHoraTerceiro * horastrabalhadasMesTerceiro;
    }

    @Override
    public void relatorioMensal() {
        System.out.println("--- Hollerith - Funcionário terceiro ---");
        super.relatorioMensal();
        System.out.println(
            "Nome da empresa: " + this.nomeEmpresa + "\n"
            + "Valor pago por hora: R$" + this.salarioPorHoraTerceiro + "\n"
            + "Horas trabalhadas no mês: " + this.horastrabalhadasMesTerceiro + "\n"
            + "salário líquido: R$" + this.salarioLiquidoTerceiro + "\n"
        );
    }
}
