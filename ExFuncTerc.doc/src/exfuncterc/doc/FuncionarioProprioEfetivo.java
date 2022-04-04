package exfuncterc.doc;

/**
 *
 * @author 0040482022028
 */
public class FuncionarioProprioEfetivo extends FuncionarioProprio {

    Double salarioHora, horasMesTrabalhadas;

    public FuncionarioProprioEfetivo(Double salarioHora, Double horasMesTrabalhadas, Double bonificacao, String nome, String rg) {
        super(bonificacao, nome, rg);
        this.salarioHora = salarioHora;
        this.horasMesTrabalhadas = horasMesTrabalhadas;
    }

    @Override
    public void relatorioMensal() {
        System.out.println("----- Funcionário Próprio Efetivo -----");
        super.relatorioMensal();
        if (horasMesTrabalhadas > 180) {
            salarioHora = salarioHora + (salarioHora * 0.5);
        }
        System.out.println("Salário a receber: R$" + salarioHora + "\n");
    }
}
