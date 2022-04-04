package exfuncterc.doc;

/**
 *
 * @author 0040482022028
 */
public class FuncionarioProprioTemporario extends FuncionarioProprio {

    Double salarioFixo;
    Integer avaliacaoMensal;

    public FuncionarioProprioTemporario(Double salarioFixo, Integer avaliacaoMensal, Double bonificacao, String nome, String rg) {
        super(bonificacao, nome, rg);
        this.salarioFixo = salarioFixo;
        this.avaliacaoMensal = avaliacaoMensal;
    }

    @Override
    public void relatorioMensal() {
        System.out.println("----- Funcionário Próprio Temporário -----");
        super.relatorioMensal();
        if (avaliacaoMensal == 5) {
            salarioFixo = salarioFixo + (salarioFixo * 0.5);
        }
        System.out.println("Salário a receber: R$" + salarioFixo + "\n");
    }
}
