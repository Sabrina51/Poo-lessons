package exercicioaluno;

/**
 *
 * @author Sabrina Silva
 */
public class Aluno {

    // <atributos>
    private String nome, ra;
    private int faltas, media;

//    // <construtor>
//
    public Aluno(String nome) {
        this.nome = nome;
    }

    // <metodo setter>
    public void setNome(String n) {
        this.nome = n;
    }

    public void setRa(String r) {
        this.ra = r;
    }

    // método que controle a quantidade de faltas;
    int faltas() {
        faltas = 4;
        return faltas;
    }

    // método para média (que é de 0 a 10); 
    int media() {
        media = 8;
        return media;
    }

    // método que verifique se o aluno foi aprovado ou não (pra ser aprovado a média deve ser maior/igual que 6 e o número de faltas deve ser menor/igual que 20);
    String situacaoAluno() {
        if (media() >= 6 && faltas() <= 20) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // Um método que imprime todos os atributos, incluindo se ele foi aprovado ou não.
    void imprimirResultado() {
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("RA do aluno: " + this.ra);
        System.out.println("Quantidade de faltas: " + faltas());
        System.out.println("Média: " + media());
        System.out.println("O aluno está " + situacaoAluno());

    }

}
