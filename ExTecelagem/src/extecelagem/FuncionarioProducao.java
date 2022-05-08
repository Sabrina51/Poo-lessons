package extecelagem;

/**
 *
 * @author Sabrina Silva
 */
public class FuncionarioProducao extends Funcionario {

    // Os da produção são horistas, recebem por hora trabalhada e 
    // trabalham em turnos onde parte das horas são diurnas e parte são noturnas
    // salário bruto para os funcionários da produção, o salário base é o valor por hora que eles recebem
    Double salarioFuncionarioProd, valorHorasDiurnas, valorHorasNoturnas;
    Integer quantidadeHorasDiurnas, quantidadeHorasNoturnas;

    public FuncionarioProducao(String nomeFuncionario, String rgFuncionario, Double salarioFuncionario) {
        super(nomeFuncionario, rgFuncionario, salarioFuncionario);
    }

    void registrarHorasDiurnas(int horasTrabalhadas) {
        // As horas diurnas são pagas de acordo com o salário base do funcionário
        quantidadeHorasDiurnas = horasTrabalhadas;
        valorHorasDiurnas = getSalarioFuncionario() * quantidadeHorasDiurnas;
    }

    void registrarHorasNoturnas(int horasTrabalhadas) {
        // As horas noturnas têm um acréscimo de 30% sobre o valor das horas diurnas.
        quantidadeHorasNoturnas = horasTrabalhadas;
        valorHorasNoturnas = (getSalarioFuncionario() * 0.30) + (getSalarioFuncionario() * quantidadeHorasNoturnas);
    }

    @Override
    double salarioLiquido() {
        return (valorHorasDiurnas + valorHorasNoturnas) * 24;
    }

    @Override
    void hollerith() {
        System.out.println("Hollerith: Funcionário Produção");
        System.out.println("---------------------------------------------");
        super.hollerith();
        System.out.println("---------------------------------------------");
        System.out.println(
            "Valor pago por hora: R$" + getSalarioFuncionario() + "\n"
            + "Trabalho diurno - Horas: " + quantidadeHorasDiurnas + "h " + "Valor: R$" + valorHorasDiurnas + "\n"
            + "Trabalho noturno - Horas: " + quantidadeHorasNoturnas + "h " + "Valor: R$" + valorHorasNoturnas + "\n"
            + "Salário líquido: R$" + salarioLiquido() + "\n\n"
        );
    }

    @Override
    void novoMes() {
        quantidadeHorasDiurnas = 0;
        quantidadeHorasNoturnas = 0;
    }

}
