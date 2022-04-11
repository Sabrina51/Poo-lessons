package extecelagem;

/**
 *
 * @author Sabrina Silva
 */
public abstract class Funcionario {

    String nomeFuncionario, rgFuncionario;
    Double salarioFuncionario;

    public Funcionario(String nomeFuncionario, String rgFuncionario, Double salarioFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.rgFuncionario = rgFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public Double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    abstract double salarioLiquido(); // retorna o salário liquido do funcionário. 
    
    abstract void novoMes(); // zera as informações que são acumuladas durante o mês, iniciando o mês seguinte.

    void hollerith() {
        // imprime o hollerith do funcionário especificando seus dados, 
        // seu salário base e tudo o que foi somado ou descontado do salário, 
        // finalizando com seu salário líquido. 
        System.out.println(
            "Nome do funcionário: " + nomeFuncionario + "\n"
            + "Número do RG: " + rgFuncionario
        );
    }
}
