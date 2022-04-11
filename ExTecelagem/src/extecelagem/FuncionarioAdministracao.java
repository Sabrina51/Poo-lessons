package extecelagem;

/**
 *
 * @author Sabrina Silva
 */
public class FuncionarioAdministracao extends Funcionario {

    // Os funcionários da administração tem salário fixo
    // No caso dos funcionários administrativos o salário base é o salário bruto do funcionário
    Double salarioFuncionarioAdm, desconto;
    Integer faltas = 0;

    public FuncionarioAdministracao(String nomeFuncionario, String rgFuncionario, Double salarioFuncionario) {
        super(nomeFuncionario, rgFuncionario, salarioFuncionario);
    }

    void registrarFalta() {
        // As faltas vão sendo acumuladas durante o mês e depois são descontadas do 
        // salário base para calcular o salário líquido. Cada falta desconta 1/30 do 
        // salário base. Este método incrementa em um o número de faltas. O método 
        // novoMes( ) zera a quantidade de faltas.
        faltas++;
        desconto = getSalarioFuncionario() / 30.0 * faltas;
    }

    @Override
    double salarioLiquido() {
        salarioFuncionarioAdm = getSalarioFuncionario() - desconto;
        return salarioFuncionarioAdm;
    }

    @Override
    void hollerith() {
        System.out.println("Hollerith: Funcionário Administração");
        System.out.println("---------------------------------------------");
        super.hollerith();
        System.out.println("---------------------------------------------");
        System.out.println(
            "Salário bruto: R$" + getSalarioFuncionario() + "\n"
            + "Quantidade de faltas: " + this.faltas + "\n"
            + "Descontos: R$" + this.desconto + "\n"
            + "Salário líquido: R$" + salarioLiquido() + "\n\n"
        );
    }

    @Override
    void novoMes() {
        faltas = 0;
    }
}
