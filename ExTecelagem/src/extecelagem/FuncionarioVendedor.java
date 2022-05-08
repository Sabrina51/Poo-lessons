package extecelagem;

/**
 *
 * @author Sabrina Silva
 */
public class FuncionarioVendedor extends Funcionario {

    // Já os vendedores recebem um valor fixo mais comissão sobre as vendas.
    // salário bruto para os vendedores é a parte fixa do salário.
    Double salarioFuncionarioVendedor, comissao, valorTotalDeVenda;

    public FuncionarioVendedor(String nomeFuncionario, String rgFuncionario, Double salarioFuncionario) {
        super(nomeFuncionario, rgFuncionario, salarioFuncionario);
    }
    
    void registrarVenda(double valorDaVenda) {
        valorTotalDeVenda = valorDaVenda;
        comissao = valorDaVenda * 0.03;
    } 

    @Override
    double salarioLiquido() {
        return getSalarioFuncionario() + comissao;
    }

    @Override
    void hollerith() {
        System.out.println("Hollerith: Funcionário Vendedor");
        System.out.println("---------------------------------------------");
        super.hollerith();
        System.out.println("---------------------------------------------");
        System.out.println(
            "Salário fixo: R$" + getSalarioFuncionario() + "\n"
            + "Valor total de vendas no mês: R$" + valorTotalDeVenda + "\n"
            + "Total de comissão(3% em cima das vendas): R$" + comissao + "\n"
            + "Salário líquido: R$" + salarioLiquido() + "\n\n"
        );
    }

    @Override
    void novoMes() {
        valorTotalDeVenda = 0.0;
    }
    
}
