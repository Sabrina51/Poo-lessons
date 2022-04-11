package exfuncterc;

/**
 *
 * @author Sabrina Silva
 */
public class FuncionarioProprioTemporario extends FuncionarioProprio {

    private Double salarioMes, salarioLiquidoTemporario, avaliacaoMes;

    public FuncionarioProprioTemporario(String nomeFuncionario, String rgFuncionario, Double salarioMes) {
        super(nomeFuncionario, rgFuncionario);
        this.salarioMes = salarioMes;
    }

    void calcularSalario(double param) {
        this.avaliacaoMes = param;
        if (this.avaliacaoMes == 5) {
            this.salarioLiquidoTemporario = salarioMes + (salarioMes * 0.05);
            setBonus(salarioMes * 0.05);
        } else {
            this.salarioLiquidoTemporario = salarioMes;
            setBonus(0);
        }
    }

    @Override
    public void relatorioMensal() {
        System.out.println("--- Hollerith - Funcionário Temporário ---");
        super.relatorioMensal();
        System.out.println(
            "Salário fixo por mês: " + this.salarioMes + "\n"
            + "Avaliação do mês: " + this.avaliacaoMes + "\n"
            + "Salário bruto: R$" + salarioMes + "\n"
            + "Bônus aplicado(5%): R$" + getBonus() + "\n"
            + "salário líquido: R$" + this.salarioLiquidoTemporario + "\n"
        );
    }
}
