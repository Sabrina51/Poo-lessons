package exfuncterc;

/**
 *
 * @author Sabrina Silva
 */
public abstract class Funcionario {

    private String nomeFuncionario, rgFuncionario;

    public Funcionario(String nomeFuncionario, String rgFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.rgFuncionario = rgFuncionario;
    }

    public void relatorioMensal() {
        System.out.println(
            "Nome do funcionário: " + this.nomeFuncionario + "\n"
            + "RG: " + this.rgFuncionario
        );
    }
}
