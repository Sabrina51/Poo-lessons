/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

public class Regular extends Aluno{
    private Double notaUm;
    private Double notaDois;

    public Regular(Double notaUm, Double notaDois, String nome, String rg, String ra) {
        super(nome, rg, ra);
        this.notaUm = notaUm;
        this.notaDois = notaDois;
    }

    public Double getNotaUm() {
        return notaUm;
    }

    public Double getNotaDois() {
        return notaDois;
    }

    public void setNotaUm(Double notaUm) {
        this.notaUm = notaUm;
    }

    public void setNotaDois(Double NotaDois) {
        this.notaDois = NotaDois;
    }
    
    public Double calculoMedia() {
        return (notaUm + notaDois) / 2;
    }
    
//    public void dadosAlunoRegular() {
//        System.out.println(
//            "----- Aluno Regular -----" + "\n" +
//            "Nome do aluno(a): " + getNome() + "\n" +
//            "RA: " + getRa() + "\n" + 
//            "RG: " + getRg() + "\n" +
//            "Nota 1: " + notaUm + "\n" +
//            "Nota 2: " + notaDois + "\n" +
//            "Média final: " + calculoMedia() + "\n"
//        );
//    }
    
    @Override
    public void print() {
        System.out.println("----- Aluno Regular ----- \n");
        super.print();
        System.out.println(
            "Nota 1: " + notaUm + "\n" +
            "Nota 2: " + notaDois + "\n" +
            "Média final: " + calculoMedia() + "\n"
        );
    }
}