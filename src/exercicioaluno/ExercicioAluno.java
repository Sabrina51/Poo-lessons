package exercicioaluno;

/**
 *
 * @author Sabrina Silva
 */

/*
 * Exercicio Aluno
 * Construa a classe Aluno com os seguintes atributos: nome, ra, faltas, media, e um construtor com parametros para classe com os atributos necessários.
 * Crie os metodos setters para nome e ra; 

 * Um método que controle a quantidade de faltas; 
 * um método para média (que é de 0 a 10); 
 * Um método que verifique se o aluno foi aprovado ou não (pra ser aprovado a média deve ser maior/igual que 6 e o número de faltas deve ser menor/igual que 20);
 * Um método que imprime todos os atributos, incluindo se ele foi aprovado ou não
 */
public class ExercicioAluno {

    public static void main(String[] args) {
        Aluno objetoAluno = new Aluno("Thomas Lira");
        
        objetoAluno.setRa("00045674889");
        
        objetoAluno.imprimirResultado();
    }
//
}
