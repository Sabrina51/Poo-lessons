package exfuncterc;

/**
 *
 * @author Sabrina Silva
 */
public class FuncionarioProprioEfetivo extends FuncionarioProprio {

    private Double salarioPorHoraEfetivo, horastrabalhadasMesEfetivo, salarioLiquidoEfetivo;

    public FuncionarioProprioEfetivo(String nomeFuncionario, String rgFuncionario, Double salarioPorHoraEfetivo) {
        super(nomeFuncionario, rgFuncionario);
        this.salarioPorHoraEfetivo = salarioPorHoraEfetivo;
    }

    void calcularSalario(double param) {
        this.horastrabalhadasMesEfetivo = param;
        Double salario = salarioPorHoraEfetivo * horastrabalhadasMesEfetivo;
        if (this.horastrabalhadasMesEfetivo > 180) {
            this.salarioLiquidoEfetivo = salario + (salario * 0.05);
            setBonus(salario * 0.05);
        } else {
            this.salarioLiquidoEfetivo = salario;
            setBonus(0);
        }
    }

    @Override
    public void relatorioMensal() {
        System.out.println("--- Hollerith - Funcionário Efetivo ---");
        super.relatorioMensal();
        System.out.println(
            "Horas trabalhadas no mês: " + this.horastrabalhadasMesEfetivo + "\n"
            + "Valor pago por hora: R$" + this.salarioPorHoraEfetivo + "\n"
            + "Salário bruto: R$" + salarioPorHoraEfetivo * horastrabalhadasMesEfetivo + "\n"
            + "Bônus aplicado(5%): R$" + getBonus() + "\n"
            + "salário líquido: R$" + this.salarioLiquidoEfetivo + "\n"
        );
    }
}
