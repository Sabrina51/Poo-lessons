/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tecelagem;

/**
 *
 * @author Perrotti
 */
public class FuncAdm extends Funcionario{
   protected int faltas;
   protected int funcAdmVetor[] = new int[4];
   protected int funcAdmVetor1[] = {1,2,3,4,5};

   // Construtor
   public FuncAdm(String nome, String RG, double salBase){
     super(nome, RG, salBase);
     faltas = 0;
   }

    public int[] getFuncAdmVetor() {
        return funcAdmVetor;
    }

    public void setFuncAdmVetor(int[] funcAdmVetor) {
        this.funcAdmVetor = funcAdmVetor;
    }   

   // Implementaçao dos métodos abstratos
   @Override
   public void novoMes(){
     faltas = 0;
   }

   protected double desconto(){
     return (salBase/30) * faltas;
   }
   
   @Override
   public double salarioLiquido(){
     return salBase - desconto();
   }

   // Acrescentando o que falta para este método
   @Override
   public void hollerith(){
     super.hollerith();
     println("Faltas no mês:" + faltas);
     println("Valor descontado: " + desconto());
   }
   
   public void registrarFalta(){
     faltas++;
   }

}
