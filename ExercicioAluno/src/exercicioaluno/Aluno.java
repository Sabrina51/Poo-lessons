/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaluno;

/**
 *
 * @author Sabrina Silva
 */

/*Exercicio Aluno
    Construa a classe Aluno com os seguintes atributos: nome, ra, faltas, media, e um construtor com parametros para classe com os atributos necessários.

    Crie os metodos setters para nome e ra; 
    Um método que controle a quantidade de faltas; 
    um método para média (que é de 0 a 10); 
    Um método que verifique se o aluno foi aprovado ou não (pra ser aprovado a média deve ser maior/igual que 6 e o número de faltas deve ser menor/igual que 20);

    Um método que imprime todos os atributos, incluindo se ele foi aprovado ou não
 */
public class Aluno {

    // <atributos>
    private String nome;
    private String ra;
    private int faltas;
    private float media;

    // <construtor>
    // Não tem retorno explícito (nem mesmo void).
    private Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    // Crie os metodos setters para nome e ra; 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    // <metodos>
    // Método que controla a quantidade de faltas;
    public void contandoFaltas(int faltas) {
        faltas++;
    }

    // método para média (que é de 0 a 10);
    public void retornarMedia() {
        media = (float) 5.6;
    }
    
    //método que verifique se o aluno foi aprovado ou não
//    public float situacaoAluno() {
//        
//    }
    
}
