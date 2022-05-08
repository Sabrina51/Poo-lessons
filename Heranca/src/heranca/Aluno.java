package heranca;

public class Aluno extends Pessoa {

    private String ra;

    // A classe aluno tem 3 atributos, sendo que dois foram herdados
    // da classe Pessoa.
    public Aluno(String nome, String rg, String ra) {
        super(nome, rg); // Chamada ao construtor da classe Pessoa
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void print() {
        System.out.println(
            "Nome : " + getNome() + "\n"
            + "RG: " + getRg() + "\n"
            + "RA: " + ra
        );
    }

}
