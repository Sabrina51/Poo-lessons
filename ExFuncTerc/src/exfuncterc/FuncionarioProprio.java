package exfuncterc;

/**
 *
 * @author Sabrina Silva
 */
public abstract class FuncionarioProprio extends Funcionario {
    
    private double bonus;

    public FuncionarioProprio(String nomeFuncionario, String rgFuncionario) {
        super(nomeFuncionario, rgFuncionario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
