package exfuncterc.doc;

/**
 *
 * @author 0040482022028
 */
public class ExFuncTercDoc {

    public static void main(String[] args) {
        FuncionarioProprioEfetivo funcionarioEfetivo1 = new FuncionarioProprioEfetivo(10.50, 50.10, 52.2, "Tomas", "123.111-5");
        FuncionarioProprioTemporario funcionarioTemporario1 = new FuncionarioProprioTemporario(600.50, 2, 0.0, "tales","123.888.4");
        FuncionarioTerceirizados funcionarioTerceirizado1 = new FuncionarioTerceirizados("Remas LTDA", 140.8, "Pablo", "789.55-8");
        
        
        funcionarioEfetivo1.relatorioMensal();
        funcionarioTemporario1.relatorioMensal();
        funcionarioTerceirizado1.relatorioMensal();
    }
    
}
