package extecelagem;

/**
 *
 * @author Sabrina Silva
 */
public class ExTecelagem {

    public static void main(String[] args) {
        FuncionarioAdministracao funcionarioAdm = new FuncionarioAdministracao("Sabrina", "236.456-8", 1212.00); // PARÂMETROS: NOME, RG, SALÁRIO FIXO BRUTO
        FuncionarioProducao funcionarioProd = new FuncionarioProducao("Izabel", "568.441-89", 7.00); // PARÂMETROS: NOME, RG, VALOR PAGO POR HORA
        FuncionarioVendedor funcionarioVendedor = new FuncionarioVendedor("Ailton", "444.895-2", 1212.00); // PARÂMETROS: NOME, RG, SALÁRIO FIXO BRUTO

        // FUNCIONARIOS DO ADMINISTRATIVO
        funcionarioAdm.registrarFalta();
        funcionarioAdm.hollerith();

        // FUNCIONÁRIOS DA PRODUÇÃO
        funcionarioProd.registrarHorasDiurnas(5); // PARÂMETROS: QUANTIDADE DE HORAS DIURNAS TRABALHADAS
        funcionarioProd.registrarHorasNoturnas(3); // PARÂMETROS: QUANTIDADE DE HORAS NOTURNAS TRABALHADAS
        funcionarioProd.hollerith();

        // FUNCIONÁRIOS VENDEDORES
        funcionarioVendedor.registrarVenda(500.00); // PARÂMETROS: VALOR TOTAL DAS VENDAS FEITAS NO MÊS
        funcionarioVendedor.hollerith();

    }

}
