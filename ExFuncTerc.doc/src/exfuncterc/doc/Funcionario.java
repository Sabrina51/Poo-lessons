package exfuncterc.doc;

/**
 *
 * @author 0040482022028
 */
public class Funcionario {

    private String nome, rg;

    public Funcionario(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void relatorioMensal() {
        System.out.println(
            "Nome do funcionário: " + nome + "\n"
            + "Rg: " + rg);
    }

}
