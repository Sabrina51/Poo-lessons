package exfuncterc.doc;

/**
 *
 * @author 0040482022028
 */
public class FuncionarioProprio extends Funcionario {

    Double bonificacao;

    public FuncionarioProprio(Double bonificacao, String nome, String rg) {
        super(nome, rg);
        this.bonificacao = bonificacao;
    }

    @Override
    public void relatorioMensal() {
        super.relatorioMensal();
        System.out.println("Bonificação: R$" + bonificacao);
    }
}
