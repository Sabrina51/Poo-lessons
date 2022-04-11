package exfuncterc;

/**
 *
 * @author Sabrina Silva
 */
public class ExFuncTerc {

    public static void main(String[] args) {
        FuncionarioProprioEfetivo funcEfetivo1 = new FuncionarioProprioEfetivo("Tamara", "123.321-9", 15.00); //PARAMETRO: NOME, RE e VALOR PAGO POR HORA
        FuncionarioProprioTemporario funcTemporario1 = new FuncionarioProprioTemporario("Rayssa", "654.485-8", 1200.00); //PARAMETRO: NOME, RE e VALOR PAGO POR MÊS
        FuncionarioTerceiro funcTerceiro1 = new FuncionarioTerceiro("Tales", "444.888-8", 14.00); //PARAMETRO: NOME, RE e VALOR PAGO POR HORA

        funcEfetivo1.calcularSalario(190); //PARAMETRO: HORAS TRABALHADAS NO MÊS
        funcEfetivo1.relatorioMensal();

        funcTemporario1.calcularSalario(5.0); //PARAMETRO: AVALIACAO NO MÊS
        funcTemporario1.relatorioMensal();

        funcTerceiro1.calcularSalario("Coman S/A", 180.0); //PARAMETRO: EMPRESA E HORAS TRABALHADAS NO MÊS
        funcTerceiro1.relatorioMensal();
    }
}
